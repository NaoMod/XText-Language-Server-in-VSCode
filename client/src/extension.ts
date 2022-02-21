import path = require('path');
import { ExtensionContext } from 'vscode';
import {
    LanguageClient,
    LanguageClientOptions,
    ServerOptions
} from 'vscode-languageclient';

let client: LanguageClient;

// Main class in the server jar
const main: string = 'org.eclipse.xtext.ide.server.ServerLauncher';

export function activate(context: ExtensionContext) {
    const executable: string = path.join('java');
    const classPath: string = path.join(__dirname,'../src/naomod.family.ide-1.0.0-SNAPSHOT-ls.jar');

    // add-opens flag needed to bypass an error caused by reflective accesses in XText generated code
    const args: string[] = ['-cp', classPath, '--add-opens', 'java.base/java.lang=ALL-UNNAMED'];

    const debugOptions = { execArgv: ['-Xdebug', '-Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n,quiet=y'] };

    const serverOptions: ServerOptions = {
        command: executable,
        args: [...args, main],
    }

    const clientOptions: LanguageClientOptions = {
        documentSelector: [{ scheme: 'file', language: 'family' }]
    };

    client = new LanguageClient(
        'family-dsl-language-server',
        'Family DSL Language Server',
        serverOptions,
        clientOptions
    )

    let disposable = client.start();

    // Adding the disposable to the subscriptions will close the server when the extension is deactivated
    context.subscriptions.push(disposable);
}

export function deactivate() {
    console.log('Family DSL extension deactivated.');
}

