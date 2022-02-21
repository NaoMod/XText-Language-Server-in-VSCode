cleanClient:
	rm -rf client/node_modules
	rm -rf client/out

cleanServer:
	mvn -f server/naomod.family.parent clean
	rm -rf server.naomod.family.parent/naomod.family/target
	rm -rf server.naomod.family.parent/naomod.family.ide/target

clean: cleanClient cleanServer

buildClient:
	npm install --prefix client/

buildServer:
	mvn -f server/naomod.family.parent clean package
	cp server/naomod.family.parent/naomod.family.ide/target/naomod.family.ide-1.0.0-SNAPSHOT-ls.jar client/src/

build: buildClient buildServer