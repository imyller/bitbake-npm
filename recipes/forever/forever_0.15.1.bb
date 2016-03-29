DESCRIPTION = "A simple CLI tool for ensuring that a given script runs continuously (i.e. forever)."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=da5360871cfc7e3df08cde6a2adeac25"

PR = "r1"

# Add support for npm:// source URI
inherit npm-fetch

SRC_URI = "npm://forever;version=${PV}"

S = "${WORKDIR}/npm"

do_install () {

	install -d ${D}${libdir}/node_modules/forever

	cp -rp ${S}/* ${D}${libdir}/node_modules/forever/

        install -d ${D}${bindir}

	ln -sf ${libdir}/node_modules/forever/bin/forever ${D}${bindir}/forever
	ln -sf ${libdir}/node_modules/forever/bin/foreverd ${D}${bindir}/foreverd

}

FILES_${PN} = " \
	${bindir}/forever \
	${bindir}/foreverd \
	${libdir}/node_modules/forever \
"

RDEPENDS_${PN} = "node"
