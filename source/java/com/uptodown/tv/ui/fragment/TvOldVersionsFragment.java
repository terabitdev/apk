package com.uptodown.tv.ui.fragment;

import a6.n;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.VerticalGridSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.VerticalGridPresenter;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import c8.f0;
import c8.p0;
import com.google.android.gms.internal.measurement.i6;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.workers.DownloadApkWorker;
import j8.d;
import java.util.Arrays;
import k5.e;
import k5.g;
import k5.r;
import o4.g6;
import t5.d0;
import t5.v;
import w5.a;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TvOldVersionsFragment extends VerticalGridSupportFragment {

    /* renamed from: a, reason: collision with root package name */
    public g f4504a;

    /* renamed from: b, reason: collision with root package name */
    public e f4505b;
    public AlertDialog l;
    public v m;

    public static final void a(TvOldVersionsFragment tvOldVersionsFragment, r rVar) {
        Context requireContext = tvOldVersionsFragment.requireContext();
        requireContext.getClass();
        int r = rVar.r(requireContext);
        if (r >= 0) {
            Context requireContext2 = tvOldVersionsFragment.requireContext();
            requireContext2.getClass();
            float f7 = UptodownApp.G;
            if (!n4.e.o(requireContext2, "downloadApkWorker")) {
                WorkManager.Companion.getInstance(requireContext2).enqueue(((OneTimeWorkRequest.Builder) i6.l(DownloadApkWorker.class, "downloadApkWorker")).setInputData(new Data.Builder().putInt("downloadId", r).build()).build());
                return;
            }
            Context context = tvOldVersionsFragment.getContext();
            String string = tvOldVersionsFragment.getString(R.string.msg_added_to_downlads_queue);
            string.getClass();
            g gVar = tvOldVersionsFragment.f4504a;
            gVar.getClass();
            Toast.makeText(context, String.format(string, Arrays.copyOf(new Object[]{gVar.f7358b}, 1)), 1).show();
            return;
        }
        Toast.makeText(tvOldVersionsFragment.getContext(), tvOldVersionsFragment.getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.leanback.widget.ArrayObjectAdapter, t5.v] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.leanback.widget.ArrayObjectAdapter, t5.v] */
    /* JADX WARN: Type inference failed for: r2v0, types: [r5.p, androidx.leanback.widget.Presenter] */
    /* JADX WARN: Type inference failed for: r2v1, types: [r5.p, androidx.leanback.widget.Presenter] */
    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && (extras = activity.getIntent().getExtras()) != null) {
            if (extras.containsKey("app")) {
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable2 = (Parcelable) extras.getParcelable("app", e.class);
                } else {
                    parcelable2 = extras.getParcelable("app");
                }
                this.f4505b = (e) parcelable2;
            }
            if (extras.containsKey("appInfo")) {
                if (Build.VERSION.SDK_INT >= 34) {
                    parcelable = (Parcelable) extras.getParcelable("appInfo", g.class);
                } else {
                    parcelable = extras.getParcelable("appInfo");
                }
                this.f4504a = (g) parcelable;
                Context requireContext = requireContext();
                requireContext.getClass();
                g gVar = this.f4504a;
                gVar.getClass();
                this.f4505b = a.h(requireContext, gVar.F);
            }
        }
        e eVar = this.f4505b;
        if (eVar != null) {
            ?? presenter = new Presenter();
            presenter.f10264a = eVar.l;
            presenter.f10265b = eVar;
            this.m = new ArrayObjectAdapter((Presenter) presenter);
        } else {
            g gVar2 = this.f4504a;
            if (gVar2 != null) {
                String str = gVar2.F;
                ?? presenter2 = new Presenter();
                presenter2.f10264a = str;
                this.m = new ArrayObjectAdapter((Presenter) presenter2);
            }
        }
        setAdapter(this.m);
        setTitle(getString(R.string.rollback_title));
        if (bundle == null) {
            prepareEntranceTransition();
        }
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(2);
        setGridPresenter(verticalGridPresenter);
        new Handler(Looper.getMainLooper()).postDelayed(new n(this, 26), 500L);
        setOnItemViewClickedListener(new d0(this));
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
        j8.e eVar = p0.f3588a;
        f0.z(lifecycleScope, d.f7053a, null, new g6(this, null, 11), 2);
    }
}
