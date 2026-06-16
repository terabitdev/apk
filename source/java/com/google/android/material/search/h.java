package com.google.android.material.search;

import android.view.View;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f4146b;

    public /* synthetic */ h(SearchView searchView, int i) {
        this.f4145a = i;
        this.f4146b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4145a) {
            case 0:
                SearchView.f(this.f4146b, view);
                return;
            case 1:
                SearchView.a(this.f4146b, view);
                return;
            default:
                SearchView.j(this.f4146b, view);
                return;
        }
    }
}
