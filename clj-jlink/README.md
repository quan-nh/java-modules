# clj-jlink

FIXME: description

## Run and test your app

    $ lein jlink run
    $ lein jlink test

## Assemble and package

    $ lein jlink assemble
    # creates a tarball for previously generated JRE and can be distributed without dependencies
    $ lein jlink package

## Docker

    $ docker build -t clj-jlink .
    $ docker images |grep jlink

    clj-jlink   ...      49.9MB

## License

Copyright © 2019 FIXME
