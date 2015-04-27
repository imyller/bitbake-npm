bitbake-npm
===========

BitBake 1.24 (Yocto 1.7) layer adding fetch support for Node.js NPM repositories.

Adds support for `npm://<package name>;version=<package version>` in recipe `SRC_URI`.

Installation
============

1. Add `bitbake-npm` layer to `sources/layers.txt`

    ```
      bitbake-npm,git://github.com/imyller/bitbake-npm.git,master,HEAD
    ```
    
2. Add `bitbake-npm` layer to `EXTRALAYERS` in `conf/bblayers.conf`

    ```
        EXTRALAYERS +=" \
            ${TOPDIR}/sources/bitbake-npm \
        "
    ```

3. Run `oebb.sh update`

Usage
=====

1. Inherit `npm-fetch` class in recipe

    ```
        inherit npm-fetch
    ```
    
2. Use `npm://` URI sources in the recipe `SRC_URI`

  ```
        SRC_URI = "npm://forever;version=0.11.1"
  ```

  *Note:* defining a `version` is optional
