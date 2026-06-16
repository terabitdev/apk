package com.uptodown.tv.ui.fragment;

import a5.o;
import android.R;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.BackgroundManager;
import androidx.leanback.app.DetailsSupportFragment;
import androidx.leanback.widget.Action;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ClassPresenterSelector;
import androidx.leanback.widget.DetailsOverviewLogoPresenter;
import androidx.leanback.widget.DetailsOverviewRow;
import androidx.leanback.widget.FullWidthDetailsOverviewRowPresenter;
import androidx.leanback.widget.FullWidthDetailsOverviewSharedElementHelper;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.SparseArrayObjectAdapter;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import c8.f0;
import c8.p0;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.i6;
import com.uptodown.UptodownApp;
import com.uptodown.workers.DownloadApkWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import k5.f2;
import k5.g;
import k5.j0;
import k5.p;
import k5.p2;
import k5.r;
import k5.t2;
import k5.v2;
import n4.e;
import n5.d;
import o4.a0;
import o4.b0;
import o4.b1;
import o4.b3;
import o4.bd;
import o4.j6;
import q1.e0;
import q4.c0;
import r5.b;
import t5.a;
import t5.c;
import w4.n;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TvAppDetailFragment extends DetailsSupportFragment {

    /* renamed from: a, reason: collision with root package name */
    public g f4492a;
    public ArrayObjectAdapter m;

    /* renamed from: n, reason: collision with root package name */
    public BackgroundManager f4494n;
    public AlertDialog o;
    public AlertDialog p;
    public DetailsOverviewRow q;
    public boolean r;
    public p2 s;
    public b t;

    /* renamed from: x, reason: collision with root package name */
    public final ActivityResultLauncher f4496x;

    /* renamed from: b, reason: collision with root package name */
    public long f4493b = -1;
    public int l = -1;
    public boolean u = true;
    public boolean v = true;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f4495w = new e0(this);

    public TvAppDetailFragment() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new j6(this, 7));
        registerForActivityResult.getClass();
        this.f4496x = registerForActivityResult;
    }

    public static void a(TvAppDetailFragment tvAppDetailFragment) {
        boolean z10;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            z10 = Environment.isExternalStorageManager();
        } else if (i < 33 && ContextCompat.checkSelfPermission(tvAppDetailFragment.requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            tvAppDetailFragment.i();
        }
    }

    public final void b() {
        if (this.f4492a != null && getContext() != null) {
            g gVar = this.f4492a;
            gVar.getClass();
            long j = gVar.f7356a;
            r b10 = n5.b.b();
            if (b10 != null && b10.q == j) {
                n5.b.f();
                return;
            }
            r a10 = d.a();
            if (a10 != null && a10.q == j) {
                d.d();
            }
        }
    }

    public final void c(r rVar, String str) {
        AlertDialog alertDialog = this.o;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(str);
        builder.setPositiveButton(R.string.ok, new c(this, rVar));
        builder.setNegativeButton(R.string.cancel, new s5.b(5));
        builder.setCancelable(true);
        AlertDialog create = builder.create();
        this.o = create;
        if (create != null) {
            create.show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        boolean z10;
        boolean z11;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        AlertDialog alertDialog = this.p;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        Context requireContext = requireContext();
        requireContext.getClass();
        try {
            sharedPreferences2 = requireContext.getSharedPreferences("SettingsPreferences", 0);
        } catch (Exception unused) {
        }
        if (sharedPreferences2.contains("is_in_eea")) {
            z10 = sharedPreferences2.getBoolean("is_in_eea", true);
            if (z10) {
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                try {
                    sharedPreferences = requireContext2.getSharedPreferences("SettingsPreferences", 0);
                } catch (Exception unused2) {
                }
                if (sharedPreferences.contains("gdpr_tracking_allowed")) {
                    z11 = sharedPreferences.getBoolean("gdpr_tracking_allowed", false);
                    if (!z11) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
                        builder.setMessage(getString(com.uptodown.R.string.tracking_disabled_warning_gdpr));
                        builder.setPositiveButton(com.uptodown.R.string.gdpr_set_up, new c0(this, 2));
                        builder.setNegativeButton(R.string.cancel, new s5.b(4));
                        builder.setCancelable(true);
                        this.p = builder.create();
                        if (!requireActivity().isFinishing()) {
                            AlertDialog alertDialog2 = this.p;
                            if (alertDialog2 != null) {
                                alertDialog2.show();
                            }
                            return true;
                        }
                    }
                }
                z11 = false;
                if (!z11) {
                }
            }
            return false;
        }
        z10 = true;
        if (z10) {
        }
        return false;
    }

    public final void e(String str) {
        AlertDialog alertDialog = this.o;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(str);
        builder.setPositiveButton(R.string.ok, new s5.b(2));
        builder.setCancelable(true);
        AlertDialog create = builder.create();
        this.o = create;
        if (create != null) {
            create.show();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        File file;
        PackageManager packageManager;
        g gVar = this.f4492a;
        if (gVar != null && gVar.F != null && getContext() != null) {
            e0 e0Var = w5.g.D;
            Context requireContext = requireContext();
            requireContext.getClass();
            w5.g f7 = e0Var.f(requireContext);
            f7.b();
            g gVar2 = this.f4492a;
            gVar2.getClass();
            String str = gVar2.F;
            str.getClass();
            g gVar3 = this.f4492a;
            gVar3.getClass();
            r L = f7.L(gVar3.K, str);
            ApplicationInfo applicationInfo = null;
            if (L != null && L.c() && !L.F.isEmpty()) {
                Iterator it = L.F.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    j0 j0Var = (j0) next;
                    if (j0Var.q != null) {
                        String str2 = j0Var.q;
                        str2.getClass();
                        File file2 = new File(str2);
                        if (file2.exists() && j0Var.o == file2.length()) {
                        }
                    }
                }
                file = L.g();
                f7.d();
                if (file == null) {
                    g gVar4 = this.f4492a;
                    gVar4.getClass();
                    String str3 = gVar4.F;
                    str3.getClass();
                    p2 Y = f7.Y(str3);
                    this.s = Y;
                    if (Y != null && Y.p == 1) {
                        if (!file.isDirectory()) {
                            file = new File(file.getAbsolutePath()).getParentFile();
                        }
                        File file3 = file;
                        a0 a0Var = new a0(13, file3, this);
                        try {
                            FragmentActivity activity = getActivity();
                            if (activity != null && (packageManager = activity.getPackageManager()) != null) {
                                p2 p2Var = this.s;
                                p2Var.getClass();
                                applicationInfo = o.b(packageManager, p2Var.f7479b, 128);
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            e10.printStackTrace();
                        }
                        if (applicationInfo != null) {
                            File file4 = new File(applicationInfo.sourceDir);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(file4);
                            file3.getClass();
                            Context requireContext2 = requireContext();
                            requireContext2.getClass();
                            new n(arrayList, file3, a0Var, false, requireContext2);
                            return;
                        }
                        String string = getString(com.uptodown.R.string.installable_files_not_found);
                        string.getClass();
                        e(string);
                        return;
                    }
                    float f10 = UptodownApp.G;
                    FragmentActivity requireActivity = requireActivity();
                    requireActivity.getClass();
                    e.q(requireActivity, file);
                    return;
                }
                n();
                return;
            }
            file = null;
            f7.d();
            if (file == null) {
            }
        } else {
            n();
        }
    }

    public final void h(r rVar) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            g gVar = this.f4492a;
            gVar.getClass();
            rVar.a(gVar);
            int r = rVar.r(activity);
            if (r >= 0) {
                float f7 = UptodownApp.G;
                if (!e.o(activity, "downloadApkWorker")) {
                    WorkManager.Companion.getInstance(activity).enqueue(((OneTimeWorkRequest.Builder) i6.l(DownloadApkWorker.class, "downloadApkWorker")).setInputData(new Data.Builder().putInt("downloadId", r).build()).build());
                    return;
                }
                String string = getString(com.uptodown.R.string.msg_added_to_downlads_queue);
                string.getClass();
                g gVar2 = this.f4492a;
                gVar2.getClass();
                e(String.format(string, Arrays.copyOf(new Object[]{gVar2.f7358b}, 1)));
                return;
            }
            String string2 = getString(com.uptodown.R.string.descarga_error);
            string2.getClass();
            e(string2);
            o();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0091  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k5.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        SharedPreferences sharedPreferences;
        if (this.f4492a != null && getActivity() != null && !k() && !d()) {
            g gVar = this.f4492a;
            if (gVar != null && gVar.j()) {
                r rVar = new r();
                g gVar2 = this.f4492a;
                gVar2.getClass();
                rVar.a(gVar2);
                ?? obj = new Object();
                Context requireContext = requireContext();
                requireContext.getClass();
                obj.g(requireContext);
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                try {
                    sharedPreferences = requireContext2.getSharedPreferences("SettingsPreferences", 0);
                } catch (Exception unused) {
                }
                if (sharedPreferences.contains("show_warning_download_incompatible")) {
                    z10 = sharedPreferences.getBoolean("show_warning_download_incompatible", true);
                    if (!z10) {
                        if (rVar.u <= obj.g) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = obj.d(rVar);
                        z11 = obj.e(rVar);
                        g gVar3 = this.f4492a;
                        gVar3.getClass();
                        if (gVar3.U != null) {
                            g gVar4 = this.f4492a;
                            gVar4.getClass();
                            ArrayList arrayList = gVar4.U;
                            arrayList.getClass();
                            Context requireContext3 = requireContext();
                            requireContext3.getClass();
                            z14 = p.c(requireContext3, arrayList).isEmpty();
                        } else {
                            z14 = true;
                        }
                    } else {
                        z11 = true;
                        z12 = true;
                        z13 = true;
                        z14 = true;
                    }
                    if (!z12 && z13 && z11 && z14) {
                        if (getActivity() != null && !requireActivity().isFinishing()) {
                            FragmentActivity requireActivity = requireActivity();
                            requireActivity.getClass();
                            v2 h = t2.h(requireActivity);
                            if (h != null && h.d()) {
                                g gVar5 = this.f4492a;
                                gVar5.getClass();
                                if (gVar5.Z == null) {
                                    f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b3(this, rVar, (g7.c) null, 25), 3);
                                    return;
                                }
                                g gVar6 = this.f4492a;
                                gVar6.getClass();
                                f2 f2Var = gVar6.Z;
                                f2Var.getClass();
                                if (f2Var.m > 0) {
                                    FragmentActivity activity = getActivity();
                                    activity.getClass();
                                    g gVar7 = this.f4492a;
                                    gVar7.getClass();
                                    g gVar8 = this.f4492a;
                                    gVar8.getClass();
                                    f2 f2Var2 = gVar8.Z;
                                    f2Var2.getClass();
                                    ((b0) activity).O(gVar7, f2Var2, new a(this, rVar, 0), new t5.b(this, 0));
                                    return;
                                }
                                h(rVar);
                                return;
                            }
                            h(rVar);
                            return;
                        }
                        return;
                    }
                    if (z12) {
                        l("sdk");
                        String string = getString(com.uptodown.R.string.msg_warning_incompatible_sdk);
                        string.getClass();
                        c(rVar, string);
                        return;
                    }
                    if (!z13) {
                        l("abi");
                        String string2 = getString(com.uptodown.R.string.msg_warning_incompatible_abi);
                        string2.getClass();
                        c(rVar, string2);
                        return;
                    }
                    if (!z11) {
                        l("density");
                        String string3 = getString(com.uptodown.R.string.msg_warning_incompatible_density);
                        string3.getClass();
                        c(rVar, string3);
                        return;
                    }
                    l("required_feature");
                    String string4 = getString(com.uptodown.R.string.msg_warning_incompatible_required_features);
                    string4.getClass();
                    c(rVar, string4);
                    return;
                }
                z10 = true;
                if (!z10) {
                }
                if (!z12) {
                }
                if (z12) {
                }
            } else {
                l("no_file_id");
                String string5 = getString(com.uptodown.R.string.msg_app_no_compatible_files);
                string5.getClass();
                e(string5);
            }
        }
    }

    public final boolean k() {
        g gVar = this.f4492a;
        gVar.getClass();
        long j = gVar.f7356a;
        if (!n5.b.c(j) && !d.b(j)) {
            return false;
        }
        return true;
    }

    public final void l(String str) {
        boolean k10;
        if (this.f4492a != null) {
            Bundle f7 = b1.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, str);
            g gVar = this.f4492a;
            gVar.getClass();
            f7.putString("packagename", gVar.F);
            g gVar2 = this.f4492a;
            gVar2.getClass();
            if (gVar2.f7356a >= 0) {
                g gVar3 = this.f4492a;
                gVar3.getClass();
                f7.putString("appId", String.valueOf(gVar3.f7356a));
            }
            g gVar4 = this.f4492a;
            gVar4.getClass();
            if (gVar4.J >= 0) {
                g gVar5 = this.f4492a;
                gVar5.getClass();
                f7.putString("fileId", String.valueOf(gVar5.J));
            }
            g gVar6 = this.f4492a;
            if (gVar6 == null) {
                k10 = false;
            } else {
                float f10 = UptodownApp.G;
                k10 = e.k(gVar6.F);
            }
            if (k10) {
                f7.putInt("deeplink", 1);
            } else {
                f7.putInt("deeplink", 0);
            }
            new a0(requireActivity(), 22).u(f7, "warning");
        }
    }

    public final void m() {
        if (Build.VERSION.SDK_INT < 33 && ContextCompat.checkSelfPermission(requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions(requireActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 645);
        } else {
            i();
        }
    }

    public final void n() {
        if (Build.VERSION.SDK_INT >= 30) {
            if (!Environment.isExternalStorageManager()) {
                try {
                    this.f4496x.launch(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + requireContext().getPackageName())));
                    return;
                } catch (ActivityNotFoundException unused) {
                    m();
                    return;
                }
            }
            m();
            return;
        }
        m();
    }

    public final void o() {
        SparseArrayObjectAdapter sparseArrayObjectAdapter;
        long j;
        g gVar;
        if (getActivity() != null) {
            if (this.l != 1) {
                try {
                    sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new Presenter());
                    try {
                        gVar = this.f4492a;
                    } catch (NumberFormatException e10) {
                        e10.printStackTrace();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (gVar != null && gVar.p != null) {
                    gVar.getClass();
                    String str = gVar.p;
                    str.getClass();
                    j = Long.parseLong(str);
                    String string = requireActivity().getString(com.uptodown.R.string.updates_button_download_app);
                    Context requireContext = requireContext();
                    requireContext.getClass();
                    sparseArrayObjectAdapter.set(1, new Action(1L, string, a4.x(requireContext, j)));
                    sparseArrayObjectAdapter.set(3, new Action(3L, requireActivity().getString(com.uptodown.R.string.dialogo_app_old_versions)));
                    sparseArrayObjectAdapter.set(4, new Action(4L, requireActivity().getString(com.uptodown.R.string.virustotal_safety_report_title)));
                    sparseArrayObjectAdapter.set(5, new Action(5L, requireActivity().getString(com.uptodown.R.string.app_detail_more_info_title)));
                    DetailsOverviewRow detailsOverviewRow = this.q;
                    detailsOverviewRow.getClass();
                    detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                    this.l = 1;
                }
                j = 0;
                String string2 = requireActivity().getString(com.uptodown.R.string.updates_button_download_app);
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                sparseArrayObjectAdapter.set(1, new Action(1L, string2, a4.x(requireContext2, j)));
                sparseArrayObjectAdapter.set(3, new Action(3L, requireActivity().getString(com.uptodown.R.string.dialogo_app_old_versions)));
                sparseArrayObjectAdapter.set(4, new Action(4L, requireActivity().getString(com.uptodown.R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, requireActivity().getString(com.uptodown.R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow2 = this.q;
                detailsOverviewRow2.getClass();
                detailsOverviewRow2.setActionsAdapter(sparseArrayObjectAdapter);
                this.l = 1;
            }
            b bVar = this.t;
            bVar.getClass();
            v5.b bVar2 = bVar.f10250b;
            if (bVar2 != null) {
                bVar2.a(0);
            }
        }
    }

    @Override // androidx.leanback.app.DetailsSupportFragment, androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        BackgroundManager backgroundManager;
        Parcelable parcelable;
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Bundle extras = activity.getIntent().getExtras();
            if (extras != null) {
                if (extras.containsKey("appId")) {
                    this.f4493b = extras.getLong("appId");
                }
                if (extras.containsKey("appInfo")) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        parcelable = (Parcelable) extras.getParcelable("appInfo", g.class);
                    } else {
                        parcelable = extras.getParcelable("appInfo");
                    }
                    g gVar = (g) parcelable;
                    this.f4492a = gVar;
                    if (gVar != null) {
                        this.f4493b = gVar.f7356a;
                    }
                }
            }
            BackgroundManager backgroundManager2 = BackgroundManager.getInstance(activity);
            this.f4494n = backgroundManager2;
            if (backgroundManager2 != null && !backgroundManager2.isAttached() && (backgroundManager = this.f4494n) != null) {
                backgroundManager.attach(activity.getWindow());
            }
            Drawable drawable = ContextCompat.getDrawable(activity, com.uptodown.R.drawable.tv_default_background);
            BackgroundManager backgroundManager3 = this.f4494n;
            if (backgroundManager3 != null) {
                backgroundManager3.setDrawable(drawable);
            }
            this.t = new b(this.f4495w);
            FullWidthDetailsOverviewRowPresenter fullWidthDetailsOverviewRowPresenter = new FullWidthDetailsOverviewRowPresenter(this.t, new DetailsOverviewLogoPresenter());
            fullWidthDetailsOverviewRowPresenter.setBackgroundColor(ContextCompat.getColor(activity, com.uptodown.R.color.background_color));
            fullWidthDetailsOverviewRowPresenter.setInitialState(0);
            FullWidthDetailsOverviewSharedElementHelper fullWidthDetailsOverviewSharedElementHelper = new FullWidthDetailsOverviewSharedElementHelper();
            fullWidthDetailsOverviewSharedElementHelper.setSharedElementEnterTransition(activity, "transition_name");
            fullWidthDetailsOverviewRowPresenter.setListener(fullWidthDetailsOverviewSharedElementHelper);
            fullWidthDetailsOverviewRowPresenter.setParticipatingEntranceTransition(false);
            prepareEntranceTransition();
            fullWidthDetailsOverviewRowPresenter.setOnActionClickedListener(new androidx.compose.runtime.composer.linkbuffer.a(11, this, activity));
            fullWidthDetailsOverviewRowPresenter.setActionsBackgroundColor(ContextCompat.getColor(activity, com.uptodown.R.color.main_blue));
            ClassPresenterSelector classPresenterSelector = new ClassPresenterSelector();
            classPresenterSelector.addClassPresenter(DetailsOverviewRow.class, fullWidthDetailsOverviewRowPresenter);
            classPresenterSelector.addClassPresenter(ListRow.class, new ListRowPresenter());
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(classPresenterSelector);
            this.m = arrayObjectAdapter;
            setAdapter(arrayObjectAdapter);
            if (this.f4492a != null) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new Presenter());
                g gVar2 = this.f4492a;
                gVar2.getClass();
                DetailsOverviewRow detailsOverviewRow = new DetailsOverviewRow(gVar2);
                this.q = detailsOverviewRow;
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                g gVar3 = this.f4492a;
                gVar3.getClass();
                if (gVar3.e() != null) {
                    m4.a0 d10 = m4.a0.d();
                    g gVar4 = this.f4492a;
                    gVar4.getClass();
                    d10.e(gVar4.e()).b(new bd(this, 10));
                } else if (getContext() != null) {
                    Drawable drawable2 = ContextCompat.getDrawable(requireContext(), com.uptodown.R.drawable.feature_tv);
                    BackgroundManager backgroundManager4 = this.f4494n;
                    backgroundManager4.getClass();
                    backgroundManager4.setDrawable(drawable2);
                }
                m4.a0 d11 = m4.a0.d();
                g gVar5 = this.f4492a;
                gVar5.getClass();
                d11.e(gVar5.h()).b(new p6.c(this));
                ArrayObjectAdapter arrayObjectAdapter2 = this.m;
                arrayObjectAdapter2.getClass();
                DetailsOverviewRow detailsOverviewRow2 = this.q;
                detailsOverviewRow2.getClass();
                arrayObjectAdapter2.add(detailsOverviewRow2);
            }
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            j8.e eVar = p0.f3588a;
            f0.z(lifecycleScope, h8.n.f6148a, null, new b3(this, null, 26), 2);
            d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z10;
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 831) {
            if (iArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && iArr[0] == 0) {
                i();
            }
        }
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.v) {
            u();
        } else {
            this.v = false;
        }
    }

    @Override // androidx.leanback.app.DetailsSupportFragment, androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (!this.u) {
            f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new t5.e(this, null, 1), 3);
        }
        this.u = false;
    }

    @Override // androidx.leanback.app.DetailsSupportFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        BackgroundManager backgroundManager = this.f4494n;
        backgroundManager.getClass();
        backgroundManager.release();
        super.onStop();
    }

    public final void p(r rVar) {
        if (getActivity() != null) {
            if (this.l != 3) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new Presenter());
                sparseArrayObjectAdapter.set(1, new Action(1L, requireActivity().getString(R.string.cancel)));
                if (this.f4492a != null) {
                    String packageName = requireActivity().getPackageName();
                    g gVar = this.f4492a;
                    gVar.getClass();
                    if (!v.a0(packageName, gVar.F, true)) {
                        sparseArrayObjectAdapter.set(3, new Action(3L, getString(com.uptodown.R.string.dialogo_app_old_versions)));
                    }
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(com.uptodown.R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(com.uptodown.R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow = this.q;
                detailsOverviewRow.getClass();
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                this.l = 3;
            }
            b bVar = this.t;
            bVar.getClass();
            int i = rVar.i();
            v5.b bVar2 = bVar.f10250b;
            if (bVar2 != null) {
                bVar2.a(i);
            }
        }
    }

    public final void q() {
        if (getActivity() != null) {
            if (this.l != 2) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new Presenter());
                sparseArrayObjectAdapter.set(1, new Action(1L, getString(com.uptodown.R.string.option_button_install)));
                if (getActivity() != null && this.f4492a != null) {
                    String packageName = requireActivity().getPackageName();
                    g gVar = this.f4492a;
                    gVar.getClass();
                    if (!v.a0(packageName, gVar.F, true)) {
                        sparseArrayObjectAdapter.set(3, new Action(3L, getString(com.uptodown.R.string.dialogo_app_old_versions)));
                    }
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(com.uptodown.R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(com.uptodown.R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow = this.q;
                detailsOverviewRow.getClass();
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                this.l = 2;
            }
            b bVar = this.t;
            bVar.getClass();
            v5.b bVar2 = bVar.f10250b;
            if (bVar2 != null) {
                bVar2.a(0);
            }
        }
    }

    public final void r() {
        if (getActivity() != null) {
            if (this.l != 7) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new Presenter());
                sparseArrayObjectAdapter.set(1, new Action(1L, getString(com.uptodown.R.string.installing)));
                if (getActivity() != null && this.f4492a != null) {
                    String packageName = requireActivity().getPackageName();
                    g gVar = this.f4492a;
                    gVar.getClass();
                    if (!v.a0(packageName, gVar.F, true)) {
                        sparseArrayObjectAdapter.set(3, new Action(3L, getString(com.uptodown.R.string.dialogo_app_old_versions)));
                    }
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(com.uptodown.R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(com.uptodown.R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow = this.q;
                detailsOverviewRow.getClass();
                detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                this.l = 7;
            }
            b bVar = this.t;
            bVar.getClass();
            v5.b bVar2 = bVar.f10250b;
            if (bVar2 != null) {
                bVar2.p.setIndeterminate(true);
            }
        }
    }

    public final void s() {
        if (getActivity() != null && this.l != 0) {
            SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new Presenter());
            if (getActivity() != null && this.f4492a != null) {
                String packageName = requireActivity().getPackageName();
                g gVar = this.f4492a;
                gVar.getClass();
                if (!v.a0(packageName, gVar.F, true)) {
                    sparseArrayObjectAdapter.set(1, new Action(1L, getString(com.uptodown.R.string.open)));
                    sparseArrayObjectAdapter.set(2, new Action(2L, getString(com.uptodown.R.string.dialogo_app_selected_uninstall)));
                    sparseArrayObjectAdapter.set(3, new Action(3L, getString(com.uptodown.R.string.dialogo_app_old_versions)));
                }
            }
            sparseArrayObjectAdapter.set(4, new Action(4L, getString(com.uptodown.R.string.virustotal_safety_report_title)));
            sparseArrayObjectAdapter.set(5, new Action(5L, getString(com.uptodown.R.string.app_detail_more_info_title)));
            DetailsOverviewRow detailsOverviewRow = this.q;
            detailsOverviewRow.getClass();
            detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
            this.l = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:9:0x0015, B:11:0x001e, B:12:0x0036, B:14:0x0068, B:15:0x008c, B:20:0x0031), top: B:2:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        long j;
        String packageName;
        g gVar;
        g gVar2;
        try {
            if (getActivity() != null && this.f4492a != null) {
                SparseArrayObjectAdapter sparseArrayObjectAdapter = new SparseArrayObjectAdapter(new Presenter());
                try {
                    gVar2 = this.f4492a;
                    gVar2.getClass();
                } catch (NumberFormatException e10) {
                    e10.printStackTrace();
                }
                if (gVar2.p != null) {
                    g gVar3 = this.f4492a;
                    gVar3.getClass();
                    String str = gVar3.p;
                    str.getClass();
                    j = Long.parseLong(str);
                    String string = getString(com.uptodown.R.string.updates_button_download_app);
                    Context requireContext = requireContext();
                    requireContext.getClass();
                    sparseArrayObjectAdapter.set(1, new Action(1L, string, a4.x(requireContext, j)));
                    packageName = requireActivity().getPackageName();
                    gVar = this.f4492a;
                    gVar.getClass();
                    if (!v.a0(packageName, gVar.F, true)) {
                        sparseArrayObjectAdapter.set(2, new Action(2L, getString(com.uptodown.R.string.dialogo_app_selected_uninstall)));
                        sparseArrayObjectAdapter.set(3, new Action(3L, getString(com.uptodown.R.string.dialogo_app_old_versions)));
                    }
                    sparseArrayObjectAdapter.set(4, new Action(4L, getString(com.uptodown.R.string.virustotal_safety_report_title)));
                    sparseArrayObjectAdapter.set(5, new Action(5L, getString(com.uptodown.R.string.app_detail_more_info_title)));
                    DetailsOverviewRow detailsOverviewRow = this.q;
                    detailsOverviewRow.getClass();
                    detailsOverviewRow.setActionsAdapter(sparseArrayObjectAdapter);
                }
                j = 0;
                String string2 = getString(com.uptodown.R.string.updates_button_download_app);
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                sparseArrayObjectAdapter.set(1, new Action(1L, string2, a4.x(requireContext2, j)));
                packageName = requireActivity().getPackageName();
                gVar = this.f4492a;
                gVar.getClass();
                if (!v.a0(packageName, gVar.F, true)) {
                }
                sparseArrayObjectAdapter.set(4, new Action(4L, getString(com.uptodown.R.string.virustotal_safety_report_title)));
                sparseArrayObjectAdapter.set(5, new Action(5L, getString(com.uptodown.R.string.app_detail_more_info_title)));
                DetailsOverviewRow detailsOverviewRow2 = this.q;
                detailsOverviewRow2.getClass();
                detailsOverviewRow2.setActionsAdapter(sparseArrayObjectAdapter);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.l = 5;
    }

    public final void u() {
        f0.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new t5.e(this, null, 4), 3);
    }
}
