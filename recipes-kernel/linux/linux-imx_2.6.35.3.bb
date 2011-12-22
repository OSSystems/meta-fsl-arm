# Copyright (C) 2011 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Linux kernel for imx platforms"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
PR = "r7"

inherit kernel
COMPATIBLE_MACHINE = "(imx53qsb|imx53ard)"

# 2.6.35 11.09.01 tag
SRCREV = "691c08adeed64d5153937a0e31aaf4c251924471"

SRC_URI = "git://opensource.freescale.com/pub/scm/imx/linux-2.6-imx.git;protocol=http \
           file://plat-mxc-double-dma-zone-max.patch \
           file://devtmpfs-init-options-alignment.patch \
           file://defconfig \
          "

S = "${WORKDIR}/git"
