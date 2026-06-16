package com.google.android.material.search;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f4148b;

    public /* synthetic */ i(SearchView searchView, int i) {
        this.f4147a = i;
        this.f4148b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4147a) {
            case 0:
                this.f4148b.lambda$requestFocusAndShowKeyboard$8();
                return;
            case 1:
                this.f4148b.show();
                return;
            case 2:
                this.f4148b.lambda$clearFocusAndHideKeyboard$9();
                return;
            default:
                this.f4148b.requestFocusAndShowKeyboardIfNeeded();
                return;
        }
    }
}
