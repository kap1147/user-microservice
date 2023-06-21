#!/bin/bash

if [ -f /run/secrets/APP_PORT ]; then
  export APP_PORT=$(cat /run/secrets/APP_PORT)
fi

if [ -f /run/secrets/DB_USERNAME ]; then
  export DB_USERNAME=$(cat /run/secrets/DB_USERNAME)
fi

if [ -f /run/secrets/DB_PASSWORD ]; then
  export DB_PASSWORD=$(cat /run/secrets/DB_PASSWORD)
fi

if [ -f /run/secrets/DB_NAME ]; then
  export DB_NAME=$(cat /run/secrets/DB_NAME)
fi

if [ -f /run/secrets/DB_HOST ]; then
  export DB_HOST=$(cat /run/secrets/DB_HOST)
fi

if [ -f /run/secrets/DB_PORT ]; then
  export DB_PORT=$(cat /run/secrets/DB_PORT)
fi

set -e

exec "$@"