package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public abstract class x implements IInterface {
    public final /* synthetic */ int i;
    public final IBinder j;

    /* renamed from: k, reason: collision with root package name */
    public final String f4038k;

    public /* synthetic */ x(IBinder iBinder, String str, int i) {
        this.i = i;
        this.j = iBinder;
        this.f4038k = str;
    }

    public Parcel G() {
        switch (this.i) {
            case 0:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f4038k);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f4038k);
                return obtain2;
        }
    }

    public void H(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.j.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void I(Parcel parcel) {
        try {
            this.j.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public void a(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            this.j.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.i) {
            case 0:
                return this.j;
            case 1:
                return this.j;
            case 2:
                return this.j;
            default:
                return this.j;
        }
    }

    public Parcel c(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.j.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel d(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.j.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }
}
