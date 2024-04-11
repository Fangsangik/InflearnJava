package chap23.immutable.address;

import chap23.immutable.Address;

public class MemberV2 {
    private String name;
    private ImmutableAddress address;

    public MemberV2(String name, ImmutableAddress address) {
        this.name = name;
        this.address = address;
    }

    public ImmutableAddress getAddress() {
        return address;
    }

    public void setAddress(ImmutableAddress immutableAddress) {
        this.address = immutableAddress;
    }

    @Override
    public String toString() {
        return "MemberV2{" +
                "name='" + name + '\'' +
                ", immutableAddress=" + address +
                '}';
    }
}
