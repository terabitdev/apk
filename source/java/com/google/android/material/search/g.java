package com.google.android.material.search;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4144b;

    public /* synthetic */ g(Object obj, int i) {
        this.f4143a = i;
        this.f4144b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4143a) {
            case 0:
                ((SearchViewAnimationHelper) this.f4144b).hide();
                return;
            case 1:
                SearchViewAnimationHelper.d((SearchViewAnimationHelper) this.f4144b);
                return;
            case 2:
                SearchViewAnimationHelper.a((SearchViewAnimationHelper) this.f4144b);
                return;
            default:
                SearchBar.a((SearchBar) this.f4144b);
                return;
        }
    }
}
