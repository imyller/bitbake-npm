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

python () {
        import npm
        bb.fetch2.methods.append( npm.NPM() )
}
