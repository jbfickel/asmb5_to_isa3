package assembler;

public enum LexState {
    LS_START, LS_INTEGER1, LS_INTEGER2, LS_HEXADECIMAL1, LS_HEXADECIMAL2, LS_SIGN, LS_IDENT, LS_DOTCOMMAND1, LS_DOTCOMMAND2, LS_ADDRMODE1, LS_ADDRMODE2, LS_STOP
}
