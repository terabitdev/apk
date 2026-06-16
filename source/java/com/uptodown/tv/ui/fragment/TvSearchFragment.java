package com.uptodown.tv.ui.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.leanback.R;
import androidx.leanback.app.SearchSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.ObjectAdapter;
import androidx.leanback.widget.SearchBar;
import androidx.lifecycle.LifecycleOwnerKt;
import c8.f0;
import c8.x1;
import g7.c;
import o4.j6;
import t5.g0;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TvSearchFragment extends SearchSupportFragment implements SearchSupportFragment.SearchResultProvider {
    public static final /* synthetic */ int m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayObjectAdapter f4506a = new ArrayObjectAdapter(new ListRowPresenter());

    /* renamed from: b, reason: collision with root package name */
    public String f4507b;
    public x1 l;

    public final void a(String str) {
        this.f4506a.clear();
        if (!TextUtils.isEmpty(str)) {
            x1 x1Var = this.l;
            c cVar = null;
            if (x1Var != null) {
                x1Var.cancel(null);
            }
            this.l = f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new t5.f0(this, str, cVar, 0), 3);
        }
    }

    @Override // androidx.leanback.app.SearchSupportFragment.SearchResultProvider
    public final ObjectAdapter getResultsAdapter() {
        return this.f4506a;
    }

    @Override // androidx.leanback.app.SearchSupportFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSearchResultProvider(this);
        setOnItemViewClickedListener(new j6(this, 10));
    }

    @Override // androidx.leanback.app.SearchSupportFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        x1 x1Var = this.l;
        if (x1Var != null) {
            x1Var.cancel(null);
        }
    }

    @Override // androidx.leanback.app.SearchSupportFragment.SearchResultProvider
    public final boolean onQueryTextChange(String str) {
        if (str != null && str.length() > 2 && !str.equalsIgnoreCase(this.f4507b)) {
            this.f4507b = str;
            a(str);
            return true;
        }
        return true;
    }

    @Override // androidx.leanback.app.SearchSupportFragment.SearchResultProvider
    public final boolean onQueryTextSubmit(String str) {
        if (str != null && str.length() > 2 && !str.equalsIgnoreCase(this.f4507b)) {
            this.f4507b = str;
            a(str);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        SearchBar searchBar = (SearchBar) view.findViewById(R.id.lb_search_bar);
        if (searchBar != null) {
            searchBar.setSearchBarListener(new g0(this));
        }
    }
}
