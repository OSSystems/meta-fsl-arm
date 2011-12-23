# Copyright (C) 2011 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "bootloader for imx platforms"
require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=4c6cde5df68eff615d36789dc18edd3b"

# TODO: add support for safe boot stream
# DEPENDS = "elftosb-native"

PV = "v2009.08"

PR = "r2"

# 2.6.35 11.09.01 tag
SRCREV="329240314138de1fb8d3d08531e0c3408482972f"

SRC_URI = "git://opensource.freescale.com/pub/scm/imx/uboot-imx.git;protocol=http"

S = "${WORKDIR}/git"
