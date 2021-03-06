# Provides the i.MXS common settings

include conf/distro/include/fsl-default-settings.inc
include conf/distro/include/fsl-default-versions.inc
include conf/distro/include/fsl-default-revisions.inc
include conf/distro/include/fsl-default-providers.inc

include conf/machine/include/soc-family.inc
include conf/machine/include/tune-arm926ejs.inc

SOC_FAMILY = "mxs"

XSERVER = "xserver-xorg-lite \
           xf86-input-evdev \
           xf86-video-fbdev"

# Ship kernel modules
MACHINE_EXTRA_RRECOMMENDS = "kernel-modules"

# Extra audio support
MACHINE_EXTRA_RRECOMMENDS += "imx-lib imx-audio \
                              pulseaudio \
                              fsl-mm-codeclib \
                              gst-fsl-plugin"

SERIAL_CONSOLE = "115200 ttyAMA0"
