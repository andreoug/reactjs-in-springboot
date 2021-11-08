#!/usr/bin/env bash

docker build -f Dockerfile -t server:0.1 . && docker run -p 8080:8080 --name server  server:0.1
