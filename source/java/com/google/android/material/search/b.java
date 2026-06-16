package com.google.android.material.search;

import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchBarAnimationHelper;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements SearchBarAnimationHelper.OnLoadAnimationInvocation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4133a;

    public /* synthetic */ b(int i) {
        this.f4133a = i;
    }

    @Override // com.google.android.material.search.SearchBarAnimationHelper.OnLoadAnimationInvocation
    public final void invoke(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        switch (this.f4133a) {
            case 0:
                onLoadAnimationCallback.onAnimationStart();
                return;
            default:
                onLoadAnimationCallback.onAnimationEnd();
                return;
        }
    }
}
