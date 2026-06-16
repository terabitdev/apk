package com.google.android.material.textfield;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4176b;

    public /* synthetic */ d(Object obj, int i) {
        this.f4175a = i;
        this.f4176b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4175a) {
            case 0:
                ClearTextEndIconDelegate.e((ClearTextEndIconDelegate) this.f4176b);
                return;
            case 1:
                DropdownMenuEndIconDelegate.a((DropdownMenuEndIconDelegate) this.f4176b);
                return;
            default:
                TextInputLayout.a((TextInputLayout) this.f4176b);
                return;
        }
    }
}
