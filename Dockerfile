FROM postgres:latest
ENV POSTGRES_DB=fm_database
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=postgres

# COPY create-db.sql /docker-entrypoint-initdb.d/
COPY dump.sql /docker-entrypoint-initdb.d/


#docker exec <container-id> pg_dump -U <username> <database-name> > dump.sql
