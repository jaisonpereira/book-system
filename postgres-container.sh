echo "upping container postgressql"
#sudo docker run -p 5432:5432 -v /tmp/database:/var/lib/postgresql/data -e POSTGRES_PASSWORD=1234 postgres
sudo docker run -p 5432:5432 -e POSTGRES_PASSWORD=1234 postgres
