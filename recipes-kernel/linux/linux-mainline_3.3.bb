require linux.inc

DESCRIPTION = "Linux kernel for O.S. Systems' x86 based machines"

COMPATIBLE_MACHINE = "(ossystems-x86)"

PV = "3.3.6"
SRCREV = "b67be2a5c9ed3f101e1562a9efe160b368000f89"

SRC_URI += "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git \
            \
            file://defconfig"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(mxs)"
