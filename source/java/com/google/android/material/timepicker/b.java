package com.google.android.material.timepicker;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4183b;

    public /* synthetic */ b(Object obj, int i) {
        this.f4182a = i;
        this.f4183b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4182a) {
            case 0:
                ((RadialViewGroup) this.f4183b).updateLayoutParams();
                return;
            default:
                MaterialTimePicker.a((MaterialTimePicker) this.f4183b);
                return;
        }
    }
}
