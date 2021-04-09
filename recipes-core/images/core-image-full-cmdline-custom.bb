DESCRIPTION = "This image customize the core core-image-full-cmdline to add support for WIFI interface  "
LICENSE = "MIT"

CORE_IMAGE_EXTRA_INSTALL += "\
		linux-firmware-rpidistro-bcm43455 \
		iw \
		wpa-supplicant \
		kernel-modules \
"

require  recipes-extended/images/core-image-full-cmdline.bb


# Add an extra 0.5 GB of free space to the root filesystem
IMAGE_ROOTFS_EXTRA_SPACE = "524288"
