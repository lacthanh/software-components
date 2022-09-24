package homework4.complex;

public class MyComplex {

	private double real = 0.0;
	private double imag = 0.0;
	
	public MyComplex() {
		
	}
	
	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public String toString() {
        if (imag > 0)
            return "(" + real + "+" + imag + "i)";
        else if (imag < 0)
            return "(" + real + imag + "i)";
        else if (real == 0)
            return "(" + imag + "i)";
        else if (imag == 0)
            return "(" + real + ")";
        else return "";
	}
	
	public boolean isReal() {
		if (imag == 0) 
			return true;
		return false;
	}
	
	public boolean isImagine() {
		if (real == 0) 
			return true;
		return false;
	}
	
	public boolean hasEquals(double real, double imag) {
		if (this.real == real && this.imag == imag)
			return true;
		return false;
	}
	
	public boolean hasEquals(MyComplex another) {
		if (this.real == another.real && this.imag == another.imag)
			return true;
		return false;
	}
	
	public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
	}
	
    public double argument() {
        return Math.atan2(imag, real);
    }
    
    public MyComplex add(MyComplex right) {
        real += right.getReal();
        imag += right.getImag();
        return this;
    }
    
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(real + right.getReal(), imag + right.getImag());
    }
    
    public MyComplex subtract(MyComplex right) {
        real -= right.getReal();
        imag -= right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real - right.getReal(), imag - right.getImag());
    }

    public MyComplex multiply(MyComplex right) {
        double realNew = real * right.getReal() - imag * right.getImag();
        double imagNew = real * right.getImag() + imag * right.getReal();
        this.setValue(realNew, imagNew);
        return this;
    }

    public MyComplex multiplyNew(MyComplex right) {
        double realNew = real * right.getReal() - imag * right.getImag();
        double imagNew = real * right.getImag() + imag * right.getReal();
        return new MyComplex(realNew, imagNew);
    }

    public MyComplex divide(MyComplex right) {
        MyComplex temp = this.multiplyNew(right.conjugate());
        double mau = right.getReal() * right.getReal() + right.getImag() * right.getImag();
        temp.setValue((temp.getReal() / mau), (temp.getImag() / mau));
        this.setValue(temp.getReal(), temp.getImag());
        return this;
    }

    public MyComplex divideNew(MyComplex right) {
        MyComplex temp = this.multiplyNew(right.conjugate());
        double mau = right.getReal() * right.getReal() + right.getImag() * right.getImag();
        temp.setValue((temp.getReal() / mau), (temp.getImag() / mau));
        return temp;
    }

    public MyComplex conjugate() {
        imag = -imag;
        return this;
    }
}
