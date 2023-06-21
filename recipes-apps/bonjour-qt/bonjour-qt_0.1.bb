SUMMARY = "QT Example Recipe"
LICENSE = "CLOSED"

SRC_URI = "file://src/bonjour_qt.pro \
           file://src/bonjour_qt.cpp"

DEPENDS += "qtbase"
RDEPENDS_${PN} += "qtwayland"

S = "${WORKDIR}/src"

inherit qmake5

do_install() {
  install -d ${D}${bindir}
  install -m 0755 bonjour_qt ${D}${bindir}
}

