#sudo systemctl stop mongod

cd $(dirname "$0")
if docker ps > /dev/null 2>&1 && docker-compose ps > /dev/null 2>&1; then S=; else S=sudo; fi

docker-compose up -d
cd ../
mvn spring-boot:run