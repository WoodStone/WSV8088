package no.vestein.wsv8088.cpu.registers;

/**
 * Created by Vestein on 13.11.2015.
 */
public enum Registers {

    //General registers
    AH(0x00, 0x07),
    AL(0x08, 0x0F),
    AX(0x00, 0x0F),
    BH(0x10, 0x17),
    BL(0x18, 0x1F),
    BX(0x10, 0x1F),
    CH(0x20, 0x27),
    CL(0x28, 0x2F),
    CX(0x20, 0x2F),
    DH(0x30, 0x37),
    DL(0x38, 0x3F),
    DX(0x30, 0x3F),
    //Pointer and index registers
    SP(0x40, 0x4F),
    BP(0x50, 0x5F),
    SI(0x60, 0x6F),
    DI(0x70, 0x7F),
    //Segment registers
    CS(0x80, 0x8F),
    DS(0x90, 0x9F),
    SS(0xA0, 0xAF),
    ES(0xB0, 0xBF),
    //Condition / Status flags
    SF(0xC0, 0xCF),        //CC
    O(0xC4),
    D(0xC5),
    I(0xC6),
    T(0xC7),
    S(0xC8),
    Z(0xC9),
    A(0xCB),
    P(0xCD),
    C(0xCF),
    //Instruction Pointer
    IP(0xD0, 0xDF);        //PC

    public final int start;
    public final int end;
    public final int length;


    Registers(int start, int end) {
        this.start = start;
        this.end = end;
        this.length = end - start + 1;
    }

    Registers(int start) {
        this.start = start;
        this.end = start;
        this.length = 1;
    }

}
