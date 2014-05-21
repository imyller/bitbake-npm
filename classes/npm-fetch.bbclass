#
# npm-fetch class
#
# Registers NPM method for Bitbake fetch2.
#
# Adds support for following format in recipe SRC_URI: 
# npm://<packagename>;version=<version>
#
# See recipes/forever/forever_*.bb for usage example.
# 

NPM ?= "npm"
NPM_ARCHFLAGS ?= "--arch=${TARGET_ARCH} --target_arch=${TARGET_ARCH}"

python () {
        import npm
        bb.fetch2.methods.append( npm.NPM() )
}
