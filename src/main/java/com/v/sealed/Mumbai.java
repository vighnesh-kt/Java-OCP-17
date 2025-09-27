package com.v.sealed;


public sealed class Mumbai {
}

sealed class Kurla extends Mumbai permits Kurla.Ghatkopar {

    final class Ghatkopar extends Kurla {

    }

}