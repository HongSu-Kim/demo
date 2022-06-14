package com.downcast;

class Super {

	protected int z = 10;
	protected int x = 20;

	public void printOverride() {
		System.out.println("Super printOverride()");
	}

	public void printSuper() {
		System.out.println("printSuper()");
	}

	public void zx() {
		System.out.printf("z = %d, x = %d\n", z, x);
	}
}

class Sup extends Super {

	protected int x = 30;
	protected int c = 40;

	@Override
	public void printOverride() {
		System.out.println("Sup printOverride()");
	}

	public void printSup() {
		System.out.println("printSup()");
	}

	@Override
	public void zx() {
		System.out.printf("z = %d, x = %d\n", z, x);
	}

	public void xc() {
		System.out.printf("x = %d, c = %d\n", x, c);
	}

	public void zxc() {
		System.out.printf("z = %d, x = %d, c = %d\n", z, x, c);
	}

}
