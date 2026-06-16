package com.uptodown.core.activities;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.UriPermission;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.media.session.m;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.gestures.x;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.documentfile.provider.DocumentFile;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.d;
import c7.z;
import c8.p0;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.material.tabs.TabLayout;
import com.uptodown.R;
import h7.a;
import h8.n;
import j8.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import k3.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.p;
import n2.t1;
import o4.a0;
import o4.b3;
import o4.bd;
import o4.n2;
import o4.q2;
import o4.ta;
import p6.c;
import t4.f;
import t4.h;
import t4.i;
import t4.k;
import t4.l;
import t4.n0;
import t4.o;
import t4.q;
import t4.r;
import t4.s;
import t4.u;
import t4.v;
import v4.b;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
/* loaded from: classes4.dex */
public final class FileExplorerActivity extends n0 {

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f4465q0 = 0;
    public TextView E;
    public RecyclerView F;
    public RelativeLayout G;
    public LinearLayout H;
    public LinearLayout I;
    public HorizontalScrollView J;
    public TextView K;
    public TextView L;
    public TextView M;
    public SearchView N;
    public RelativeLayout O;
    public RadioButton P;
    public RadioButton Q;
    public RadioButton R;
    public AlertDialog S;
    public Toolbar T;
    public TextView U;
    public b V;
    public ArrayList W;
    public ArrayList X;
    public DocumentFile Y;
    public ArrayList Z;

    /* renamed from: a0, reason: collision with root package name */
    public ArrayList f4466a0;

    /* renamed from: b0, reason: collision with root package name */
    public ArrayList f4467b0;

    /* renamed from: c0, reason: collision with root package name */
    public File f4468c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4469d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4470e0;

    /* renamed from: f0, reason: collision with root package name */
    public ArrayList f4471f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f4472g0;
    public TabLayout h0;

    /* renamed from: i0, reason: collision with root package name */
    public TextView f4473i0;

    /* renamed from: j0, reason: collision with root package name */
    public Uri f4474j0;

    /* renamed from: k0, reason: collision with root package name */
    public String f4475k0;

    /* renamed from: l0, reason: collision with root package name */
    public final c f4476l0 = new c(this);
    public final bd m0 = new bd(this, 9);

    /* renamed from: n0, reason: collision with root package name */
    public final u f4477n0 = new u(this);

    /* renamed from: o0, reason: collision with root package name */
    public final o4.b f4478o0 = new o4.b(this, 8);

    /* renamed from: p0, reason: collision with root package name */
    public final ActivityResultLauncher f4479p0;

    public FileExplorerActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new i(this));
        registerForActivityResult.getClass();
        this.f4479p0 = registerForActivityResult;
    }

    public static final void H(FileExplorerActivity fileExplorerActivity) {
        AlertDialog alertDialog = fileExplorerActivity.S;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        View inflate = fileExplorerActivity.getLayoutInflater().inflate(R.layout.dialog_accept_cancel, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_dialog_msg);
        textView.setTypeface(s4.c.v);
        textView.setText(textView.getContext().getString(R.string.dialog_close_file_manager));
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_accept_option);
        textView2.setText(fileExplorerActivity.getString(R.string.ok));
        textView2.setTypeface(s4.c.u);
        textView2.setOnClickListener(new f(fileExplorerActivity, 8));
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_cancel_option);
        textView3.setText(fileExplorerActivity.getString(R.string.option_button_cancel));
        textView3.setTypeface(s4.c.u);
        textView3.setOnClickListener(new f(fileExplorerActivity, 9));
        AlertDialog.Builder builder = new AlertDialog.Builder(fileExplorerActivity);
        builder.setView(inflate);
        AlertDialog create = builder.create();
        fileExplorerActivity.S = create;
        create.getClass();
        Window window = create.getWindow();
        if (window != null) {
            m.z(window, 0);
        }
        AlertDialog alertDialog2 = fileExplorerActivity.S;
        alertDialog2.getClass();
        alertDialog2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (c8.f0.K(r7, r1, r0) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (c8.f0.K(r7, r1, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object I(FileExplorerActivity fileExplorerActivity, i7.c cVar) {
        o oVar;
        int i;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i3 = oVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oVar.l = i3 - Integer.MIN_VALUE;
                Object obj = oVar.f10624a;
                i = oVar.l;
                g7.c cVar2 = null;
                int i8 = 2;
                a aVar = a.f6117a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c7.a.e(obj);
                            return z.f3538a;
                        }
                        d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c7.a.e(obj);
                } else {
                    c7.a.e(obj);
                    e eVar = p0.f3588a;
                    j8.d dVar = j8.d.f7053a;
                    t4.m mVar = new t4.m(fileExplorerActivity, cVar2, i8);
                    oVar.l = 1;
                }
                e eVar2 = p0.f3588a;
                d8.c cVar3 = n.f6148a;
                t4.m mVar2 = new t4.m(fileExplorerActivity, cVar2, 3);
                oVar.l = 2;
            }
        }
        oVar = new o(fileExplorerActivity, cVar);
        Object obj2 = oVar.f10624a;
        i = oVar.l;
        g7.c cVar22 = null;
        int i82 = 2;
        a aVar2 = a.f6117a;
        if (i == 0) {
        }
        e eVar22 = p0.f3588a;
        d8.c cVar32 = n.f6148a;
        t4.m mVar22 = new t4.m(fileExplorerActivity, cVar22, 3);
        oVar.l = 2;
    }

    public static final void J(FileExplorerActivity fileExplorerActivity, String str, int i, int i3, long j) {
        AlertDialog alertDialog = fileExplorerActivity.f10585a;
        if (alertDialog == null) {
            View inflate = fileExplorerActivity.getLayoutInflater().inflate(R.layout.dialog_copy_files, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(R.id.tv_title_dialog_copying);
            textView.setTypeface(s4.c.u);
            textView.setText(fileExplorerActivity.getString(R.string.copying, fileExplorerActivity.getString(R.string.size_of_total_size, String.valueOf(i), String.valueOf(i3))));
            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_size_dialog_copying);
            textView2.setTypeface(s4.c.v);
            textView2.setText(fileExplorerActivity.getString(R.string.size_of_total_size, fileExplorerActivity.getString(R.string.mb_placeholder, fileExplorerActivity.getString(R.string.zero)), a4.w(j)));
            ((ProgressBar) inflate.findViewById(R.id.pb_dialog_copying)).setProgress(0);
            TextView textView3 = (TextView) inflate.findViewById(R.id.tv_files_dialog_copying);
            textView3.setTypeface(s4.c.v);
            textView3.setText(str);
            TextView textView4 = (TextView) inflate.findViewById(R.id.tv_percentage_dialog_copying);
            textView4.setTypeface(s4.c.v);
            textView4.setText(fileExplorerActivity.getString(R.string.zero) + fileExplorerActivity.getString(R.string.percentage));
            AlertDialog.Builder builder = new AlertDialog.Builder(fileExplorerActivity);
            builder.setView(inflate);
            builder.setCancelable(false);
            if (!fileExplorerActivity.isFinishing()) {
                AlertDialog create = builder.create();
                fileExplorerActivity.f10585a = create;
                create.getClass();
                Window window = create.getWindow();
                if (window != null) {
                    m.z(window, 0);
                }
                AlertDialog alertDialog2 = fileExplorerActivity.f10585a;
                alertDialog2.getClass();
                alertDialog2.show();
                return;
            }
            return;
        }
        TextView textView5 = (TextView) alertDialog.findViewById(R.id.tv_title_dialog_copying);
        if (textView5 != null) {
            textView5.setText(fileExplorerActivity.getString(R.string.copying, fileExplorerActivity.getString(R.string.size_of_total_size, String.valueOf(i), String.valueOf(i3))));
        }
        AlertDialog alertDialog3 = fileExplorerActivity.f10585a;
        alertDialog3.getClass();
        TextView textView6 = (TextView) alertDialog3.findViewById(R.id.tv_files_dialog_copying);
        if (textView6 != null) {
            textView6.setTypeface(s4.c.v);
            textView6.setText(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (c8.f0.K(r8, r1, r0) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (c8.f0.K(r8, r1, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K(FileExplorerActivity fileExplorerActivity, i7.c cVar) {
        q qVar;
        int i;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i3 = qVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qVar.l = i3 - Integer.MIN_VALUE;
                Object obj = qVar.f10628a;
                i = qVar.l;
                g7.c cVar2 = null;
                a aVar = a.f6117a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c7.a.e(obj);
                            return z.f3538a;
                        }
                        d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c7.a.e(obj);
                } else {
                    c7.a.e(obj);
                    e eVar = p0.f3588a;
                    j8.d dVar = j8.d.f7053a;
                    t4.m mVar = new t4.m(fileExplorerActivity, cVar2, 5);
                    qVar.l = 1;
                }
                e eVar2 = p0.f3588a;
                d8.c cVar3 = n.f6148a;
                t4.m mVar2 = new t4.m(fileExplorerActivity, cVar2, 6);
                qVar.l = 2;
            }
        }
        qVar = new q(fileExplorerActivity, cVar);
        Object obj2 = qVar.f10628a;
        i = qVar.l;
        g7.c cVar22 = null;
        a aVar2 = a.f6117a;
        if (i == 0) {
        }
        e eVar22 = p0.f3588a;
        d8.c cVar32 = n.f6148a;
        t4.m mVar22 = new t4.m(fileExplorerActivity, cVar22, 6);
        qVar.l = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        if (c8.f0.K(r10, r3, r0) == r6) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (c8.f0.K(r10, r4, r0) != r6) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object L(FileExplorerActivity fileExplorerActivity, i7.c cVar) {
        r rVar;
        int i;
        f0 f0Var;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i3 = rVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rVar.m = i3 - Integer.MIN_VALUE;
                Object obj = rVar.f10631b;
                i = rVar.m;
                g7.c cVar2 = null;
                a aVar = a.f6117a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                c7.a.e(obj);
                                return z.f3538a;
                            }
                            d.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f0Var = rVar.f10630a;
                        c7.a.e(obj);
                        e eVar = p0.f3588a;
                        d8.c cVar3 = n.f6148a;
                        s sVar = new s(fileExplorerActivity, f0Var, cVar2, 0);
                        rVar.f10630a = null;
                        rVar.m = 3;
                    } else {
                        f0Var = rVar.f10630a;
                        c7.a.e(obj);
                    }
                } else {
                    c7.a.e(obj);
                    ?? obj2 = new Object();
                    e eVar2 = p0.f3588a;
                    d8.c cVar4 = n.f6148a;
                    t4.m mVar = new t4.m(fileExplorerActivity, cVar2, 11);
                    rVar.f10630a = obj2;
                    rVar.m = 1;
                    if (c8.f0.K(cVar4, mVar, rVar) != aVar) {
                        f0Var = obj2;
                    }
                    return aVar;
                }
                e eVar3 = p0.f3588a;
                j8.d dVar = j8.d.f7053a;
                g8.o oVar = new g8.o(fileExplorerActivity, f0Var, null);
                rVar.f10630a = f0Var;
                rVar.m = 2;
            }
        }
        rVar = new r(fileExplorerActivity, cVar);
        Object obj3 = rVar.f10631b;
        i = rVar.m;
        g7.c cVar22 = null;
        a aVar2 = a.f6117a;
        if (i == 0) {
        }
        e eVar32 = p0.f3588a;
        j8.d dVar2 = j8.d.f7053a;
        g8.o oVar2 = new g8.o(fileExplorerActivity, f0Var, null);
        rVar.f10630a = f0Var;
        rVar.m = 2;
    }

    /* JADX WARN: Type inference failed for: r12v9, types: [kotlin.jvm.internal.h0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.jvm.internal.h0, java.lang.Object] */
    public static final void M(FileExplorerActivity fileExplorerActivity, Object obj) {
        String str;
        AlertDialog alertDialog;
        if (!fileExplorerActivity.isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(fileExplorerActivity);
            LayoutInflater layoutInflater = fileExplorerActivity.getLayoutInflater();
            layoutInflater.getClass();
            View inflate = layoutInflater.inflate(R.layout.dialog_decompress_file, (ViewGroup) null, false);
            ((TextView) inflate.findViewById(R.id.tv_dialog_title_decompress)).setTypeface(s4.c.u);
            TextView textView = (TextView) inflate.findViewById(R.id.tv_dialog_file_name_decompress);
            textView.setTypeface(s4.c.v);
            RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.rb_dialog_decompress_current_path);
            radioButton.setTypeface(s4.c.v);
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(R.id.rb_dialog_decompress_select_path);
            radioButton2.setTypeface(s4.c.v);
            View findViewById = inflate.findViewById(R.id.tv_dialog_decompress_selected_path);
            findViewById.getClass();
            TextView textView2 = (TextView) findViewById;
            fileExplorerActivity.L = textView2;
            textView2.setTypeface(s4.c.v);
            ?? obj2 = new Object();
            if (obj instanceof File) {
                obj2.f7675a = ((File) obj).getParent();
            } else if (obj instanceof DocumentFile) {
                DocumentFile documentFile = fileExplorerActivity.Y;
                documentFile.getClass();
                String lastPathSegment = documentFile.getUri().getLastPathSegment();
                if (lastPathSegment != null) {
                    DocumentFile documentFile2 = fileExplorerActivity.Y;
                    documentFile2.getClass();
                    String lastPathSegment2 = documentFile2.getUri().getLastPathSegment();
                    lastPathSegment2.getClass();
                    str = lastPathSegment.substring(z7.n.t0(":", lastPathSegment2, 6) + 1);
                } else {
                    str = null;
                }
                obj2.f7675a = x.m(fileExplorerActivity.getString(R.string.sd_card), "/", str);
            }
            TextView textView3 = fileExplorerActivity.L;
            if (textView3 != null) {
                textView3.setText((CharSequence) obj2.f7675a);
                fileExplorerActivity.f4475k0 = (String) obj2.f7675a;
                TextView textView4 = (TextView) inflate.findViewById(R.id.tv_accept_option_compress);
                textView4.setTypeface(s4.c.u);
                TextView textView5 = (TextView) inflate.findViewById(R.id.tv_cancel_option_decompress);
                textView5.setTypeface(s4.c.u);
                ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.pb_dialog_decompress);
                TextView textView6 = fileExplorerActivity.L;
                if (textView6 != null) {
                    textView6.setOnClickListener(new f(fileExplorerActivity, 13));
                    radioButton.setOnCheckedChangeListener(new ta(fileExplorerActivity, (h0) obj2));
                    radioButton2.setOnCheckedChangeListener(new h(fileExplorerActivity, 3));
                    ?? obj3 = new Object();
                    textView4.setOnClickListener(new n2(obj, fileExplorerActivity, obj3, new g5.i(textView, fileExplorerActivity, inflate, progressBar, textView4, textView5), 3));
                    textView5.setOnClickListener(new k(obj3, fileExplorerActivity, 1));
                    builder.setView(inflate);
                    fileExplorerActivity.S = builder.create();
                    if (!fileExplorerActivity.isFinishing() && (alertDialog = fileExplorerActivity.S) != null) {
                        Window window = alertDialog.getWindow();
                        if (window != null) {
                            m.z(window, 0);
                        }
                        AlertDialog alertDialog2 = fileExplorerActivity.S;
                        alertDialog2.getClass();
                        alertDialog2.show();
                        return;
                    }
                    return;
                }
                p.i("tvSelectedPath");
                throw null;
            }
            p.i("tvSelectedPath");
            throw null;
        }
    }

    public static final void N(FileExplorerActivity fileExplorerActivity, Object obj, String str) {
        AlertDialog alertDialog = fileExplorerActivity.S;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        View inflate = fileExplorerActivity.getLayoutInflater().inflate(R.layout.dialog_accept_cancel, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_dialog_msg);
        textView.setTypeface(s4.c.v);
        textView.setText(textView.getContext().getString(R.string.install_dialog_confirmation_msg, str));
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_accept_option);
        textView2.setText(fileExplorerActivity.getString(R.string.option_button_install));
        textView2.setTypeface(s4.c.u);
        textView2.setOnClickListener(new q2(21, obj, fileExplorerActivity));
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_cancel_option);
        textView3.setText(fileExplorerActivity.getString(R.string.option_button_cancel));
        textView3.setTypeface(s4.c.u);
        textView3.setOnClickListener(new f(fileExplorerActivity, 14));
        AlertDialog.Builder builder = new AlertDialog.Builder(fileExplorerActivity);
        builder.setView(inflate);
        AlertDialog create = builder.create();
        fileExplorerActivity.S = create;
        create.getClass();
        Window window = create.getWindow();
        if (window != null) {
            m.z(window, 0);
        }
        AlertDialog alertDialog2 = fileExplorerActivity.S;
        alertDialog2.getClass();
        alertDialog2.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (c8.f0.K(r8, r1, r0) != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (c8.f0.K(r8, r1, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O(FileExplorerActivity fileExplorerActivity, i7.c cVar) {
        v vVar;
        int i;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i3 = vVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vVar.l = i3 - Integer.MIN_VALUE;
                Object obj = vVar.f10636a;
                i = vVar.l;
                g7.c cVar2 = null;
                a aVar = a.f6117a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c7.a.e(obj);
                            return z.f3538a;
                        }
                        d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c7.a.e(obj);
                } else {
                    c7.a.e(obj);
                    e eVar = p0.f3588a;
                    j8.d dVar = j8.d.f7053a;
                    b3 b3Var = new b3(fileExplorerActivity, cVar2, 22);
                    vVar.l = 1;
                }
                e eVar2 = p0.f3588a;
                d8.c cVar3 = n.f6148a;
                t4.m mVar = new t4.m(fileExplorerActivity, cVar2, 15);
                vVar.l = 2;
            }
        }
        vVar = new v(fileExplorerActivity, cVar);
        Object obj2 = vVar.f10636a;
        i = vVar.l;
        g7.c cVar22 = null;
        a aVar2 = a.f6117a;
        if (i == 0) {
        }
        e eVar22 = p0.f3588a;
        d8.c cVar32 = n.f6148a;
        t4.m mVar2 = new t4.m(fileExplorerActivity, cVar22, 15);
        vVar.l = 2;
    }

    public static final void P(FileExplorerActivity fileExplorerActivity) {
        LinearLayout linearLayout = fileExplorerActivity.I;
        if (linearLayout != null) {
            if (linearLayout.getChildCount() > 1) {
                LinearLayout linearLayout2 = fileExplorerActivity.I;
                if (linearLayout2 != null) {
                    linearLayout2.removeViewAt(linearLayout2.getChildCount() - 1);
                    return;
                } else {
                    p.i("llBreadcrumb");
                    throw null;
                }
            }
            return;
        }
        p.i("llBreadcrumb");
        throw null;
    }

    public static final void Q(FileExplorerActivity fileExplorerActivity) {
        int i;
        Menu menu;
        MenuItem findItem;
        Menu menu2;
        MenuItem findItem2;
        Menu menu3;
        MenuItem findItem3;
        Menu menu4;
        MenuItem findItem4;
        Toolbar toolbar;
        Menu menu5;
        MenuItem findItem5;
        Menu menu6;
        MenuItem findItem6;
        Menu menu7;
        MenuItem findItem7;
        Menu menu8;
        MenuItem findItem8;
        Menu menu9;
        MenuItem findItem9;
        boolean[] zArr;
        Menu menu10;
        MenuItem findItem10;
        Menu menu11;
        MenuItem findItem11;
        Menu menu12;
        MenuItem findItem12;
        Menu menu13;
        MenuItem findItem13;
        Menu menu14;
        MenuItem findItem14;
        Toolbar toolbar2 = fileExplorerActivity.T;
        if (toolbar2 != null && (menu14 = toolbar2.getMenu()) != null && (findItem14 = menu14.findItem(R.id.action_delete)) != null) {
            findItem14.setVisible(true);
        }
        Toolbar toolbar3 = fileExplorerActivity.T;
        if (toolbar3 != null && (menu13 = toolbar3.getMenu()) != null && (findItem13 = menu13.findItem(R.id.action_create)) != null) {
            findItem13.setVisible(true);
        }
        Toolbar toolbar4 = fileExplorerActivity.T;
        if (toolbar4 != null && (menu12 = toolbar4.getMenu()) != null && (findItem12 = menu12.findItem(R.id.action_copy)) != null) {
            findItem12.setVisible(true);
        }
        Toolbar toolbar5 = fileExplorerActivity.T;
        if (toolbar5 != null && (menu11 = toolbar5.getMenu()) != null && (findItem11 = menu11.findItem(R.id.action_compress)) != null) {
            findItem11.setVisible(true);
        }
        Toolbar toolbar6 = fileExplorerActivity.T;
        if (toolbar6 != null && (menu10 = toolbar6.getMenu()) != null && (findItem10 = menu10.findItem(R.id.action_cut)) != null) {
            findItem10.setVisible(true);
        }
        b bVar = fileExplorerActivity.V;
        if (bVar != null && (zArr = bVar.f10898d) != null) {
            i = 0;
            for (boolean z10 : zArr) {
                if (z10) {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        Toolbar toolbar7 = fileExplorerActivity.T;
        if (i > 0) {
            if (toolbar7 != null && (menu9 = toolbar7.getMenu()) != null && (findItem9 = menu9.findItem(R.id.action_delete)) != null) {
                findItem9.setEnabled(true);
            }
            Toolbar toolbar8 = fileExplorerActivity.T;
            if (toolbar8 != null && (menu8 = toolbar8.getMenu()) != null && (findItem8 = menu8.findItem(R.id.action_copy)) != null) {
                findItem8.setEnabled(true);
            }
            Toolbar toolbar9 = fileExplorerActivity.T;
            if (toolbar9 != null && (menu7 = toolbar9.getMenu()) != null && (findItem7 = menu7.findItem(R.id.action_cut)) != null) {
                findItem7.setEnabled(true);
            }
            Toolbar toolbar10 = fileExplorerActivity.T;
            if (toolbar10 != null && (menu6 = toolbar10.getMenu()) != null && (findItem6 = menu6.findItem(R.id.action_compress)) != null) {
                findItem6.setEnabled(true);
            }
        } else {
            if (toolbar7 != null && (menu4 = toolbar7.getMenu()) != null && (findItem4 = menu4.findItem(R.id.action_delete)) != null) {
                findItem4.setEnabled(false);
            }
            Toolbar toolbar11 = fileExplorerActivity.T;
            if (toolbar11 != null && (menu3 = toolbar11.getMenu()) != null && (findItem3 = menu3.findItem(R.id.action_copy)) != null) {
                findItem3.setEnabled(false);
            }
            Toolbar toolbar12 = fileExplorerActivity.T;
            if (toolbar12 != null && (menu2 = toolbar12.getMenu()) != null && (findItem2 = menu2.findItem(R.id.action_cut)) != null) {
                findItem2.setEnabled(false);
            }
            Toolbar toolbar13 = fileExplorerActivity.T;
            if (toolbar13 != null && (menu = toolbar13.getMenu()) != null && (findItem = menu.findItem(R.id.action_compress)) != null) {
                findItem.setEnabled(false);
            }
        }
        TextView textView = fileExplorerActivity.U;
        if (textView != null) {
            textView.setText(fileExplorerActivity.getString(R.string.core_x_items_selected, String.valueOf(i)));
        }
        ArrayList arrayList = fileExplorerActivity.f4471f0;
        if (arrayList != null && !arrayList.isEmpty() && (toolbar = fileExplorerActivity.T) != null && (menu5 = toolbar.getMenu()) != null && (findItem5 = menu5.findItem(R.id.action_paste)) != null) {
            findItem5.setVisible(true);
        }
    }

    public static final void R(FileExplorerActivity fileExplorerActivity) {
        b bVar = fileExplorerActivity.V;
        bVar.getClass();
        bVar.c(false);
        fileExplorerActivity.U();
        fileExplorerActivity.V(null);
    }

    @Override // t4.n0
    public final void F() {
        s4.c.f10437w.getClass();
    }

    public final void S(String str, String str2) {
        if (!isFinishing()) {
            RelativeLayout relativeLayout = this.G;
            g7.c cVar = null;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
                e eVar = p0.f3588a;
                c8.f0.z(c8.f0.b(j8.d.f7053a), null, null, new l(this, str, str2, cVar, 1), 3);
                return;
            }
            p.i("rlLoading");
            throw null;
        }
    }

    public final void T(SearchView searchView) {
        searchView.setOnQueryTextListener(null);
        searchView.setQuery("", false);
        searchView.setOnQueryTextListener(this.f4477n0);
        Object systemService = getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(searchView.getWindowToken(), 0);
    }

    public final void U() {
        Menu menu;
        MenuItem findItem;
        Menu menu2;
        MenuItem findItem2;
        Menu menu3;
        MenuItem findItem3;
        Menu menu4;
        MenuItem findItem4;
        Menu menu5;
        MenuItem findItem5;
        Menu menu6;
        MenuItem findItem6;
        TextView textView = this.U;
        if (textView != null) {
            textView.setText(getString(R.string.action_name_file_explorer));
        }
        Toolbar toolbar = this.T;
        if (toolbar != null && (menu6 = toolbar.getMenu()) != null && (findItem6 = menu6.findItem(R.id.action_create)) != null) {
            findItem6.setVisible(true);
        }
        Toolbar toolbar2 = this.T;
        if (toolbar2 != null && (menu5 = toolbar2.getMenu()) != null && (findItem5 = menu5.findItem(R.id.action_delete)) != null) {
            findItem5.setVisible(false);
        }
        Toolbar toolbar3 = this.T;
        if (toolbar3 != null && (menu4 = toolbar3.getMenu()) != null && (findItem4 = menu4.findItem(R.id.action_copy)) != null) {
            findItem4.setVisible(false);
        }
        Toolbar toolbar4 = this.T;
        if (toolbar4 != null && (menu3 = toolbar4.getMenu()) != null && (findItem3 = menu3.findItem(R.id.action_compress)) != null) {
            findItem3.setVisible(false);
        }
        Toolbar toolbar5 = this.T;
        if (toolbar5 != null && (menu2 = toolbar5.getMenu()) != null && (findItem2 = menu2.findItem(R.id.action_cut)) != null) {
            findItem2.setVisible(false);
        }
        Toolbar toolbar6 = this.T;
        if (toolbar6 != null && (menu = toolbar6.getMenu()) != null && (findItem = menu.findItem(R.id.action_paste)) != null) {
            findItem.setVisible(false);
        }
    }

    public final void V(String str) {
        File externalStorageDirectory;
        RelativeLayout relativeLayout = this.G;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
            if (this.Y == null && this.f4468c0 == null && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
                this.f4468c0 = externalStorageDirectory;
                this.Y = null;
            }
            new t(this.Y, this.f4468c0, this, new a0(12, this, str));
            return;
        }
        p.i("rlLoading");
        throw null;
    }

    public final void W(boolean z10) {
        SearchView searchView;
        if (z10 && (searchView = this.N) != null) {
            T(searchView);
        }
        V(null);
    }

    public final void X() {
        e eVar = p0.f3588a;
        c8.f0.z(c8.f0.b(j8.d.f7053a), null, null, new t4.n(this, (g7.c) null, 4), 3);
    }

    public final void Y() {
        LinearLayout linearLayout = this.I;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            LayoutInflater layoutInflater = getLayoutInflater();
            LinearLayout linearLayout2 = this.I;
            if (linearLayout2 != null) {
                View inflate = layoutInflater.inflate(R.layout.breadcrumb_main, (ViewGroup) linearLayout2, false);
                inflate.getClass();
                LinearLayout linearLayout3 = (LinearLayout) inflate;
                TextView textView = (TextView) linearLayout3.findViewById(R.id.tv_main_path);
                if (this.f4470e0) {
                    textView.setText(getString(R.string.sd_card));
                } else {
                    textView.setText(getString(R.string.internal_storage));
                }
                textView.setTypeface(s4.c.v);
                LinearLayout linearLayout4 = this.I;
                if (linearLayout4 != null) {
                    linearLayout4.addView(linearLayout3);
                    return;
                } else {
                    p.i("llBreadcrumb");
                    throw null;
                }
            }
            p.i("llBreadcrumb");
            throw null;
        }
        p.i("llBreadcrumb");
        throw null;
    }

    public final void Z() {
        boolean z10 = this.f4469d0;
        RadioButton radioButton = this.P;
        if (!z10) {
            radioButton.getClass();
            radioButton.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_az_asc_on));
            RadioButton radioButton2 = this.Q;
            radioButton2.getClass();
            radioButton2.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_size_asc_off));
            RadioButton radioButton3 = this.R;
            radioButton3.getClass();
            radioButton3.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_date_asc_off));
            return;
        }
        radioButton.getClass();
        radioButton.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_az_desc_on));
        RadioButton radioButton4 = this.Q;
        radioButton4.getClass();
        radioButton4.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_size_desc_off));
        RadioButton radioButton5 = this.R;
        radioButton5.getClass();
        radioButton5.setBackground(ContextCompat.getDrawable(this, R.drawable.core_vector_sort_date_desc_off));
    }

    public final void a0(boolean z10) {
        TextView textView = this.K;
        if (z10) {
            if (textView != null) {
                textView.setText(getString(R.string.empty_directory));
            } else {
                p.i("tvEmptyDirectory");
                throw null;
            }
        } else if (textView != null) {
            textView.setText(getString(R.string.no_permissions_directory));
        } else {
            p.i("tvEmptyDirectory");
            throw null;
        }
        TextView textView2 = this.K;
        if (textView2 != null) {
            textView2.setVisibility(0);
        } else {
            p.i("tvEmptyDirectory");
            throw null;
        }
    }

    public final void b0(Uri uri) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(uri, getContentResolver().getType(uri));
        intent.addFlags(1);
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030d  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z10;
        RecyclerView recyclerView;
        AlertDialog alertDialog;
        SharedPreferences sharedPreferences;
        String string;
        Uri uri;
        boolean z11;
        super.onCreate(bundle);
        setContentView(R.layout.file_explorer);
        ViewCompat.setOnApplyWindowInsetsListener((RelativeLayout) findViewById(R.id.rl_file_explorer), new o2.a(12));
        Bundle extras = getIntent().getExtras();
        int i = 1;
        int i3 = 0;
        if (extras != null) {
            if (extras.containsKey("subdir") && (string = extras.getString("subdir")) != null) {
                boolean z12 = extras.getBoolean("subdir_sd");
                this.f4470e0 = z12;
                if (z12) {
                    List<UriPermission> persistedUriPermissions = getContentResolver().getPersistedUriPermissions();
                    persistedUriPermissions.getClass();
                    Iterator<UriPermission> it = persistedUriPermissions.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            UriPermission next = it.next();
                            Uri uri2 = next.getUri();
                            uri2.getClass();
                            String path = uri2.getPath();
                            if (path != null) {
                                Pattern compile = Pattern.compile(".*\\b[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]-[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]:.*");
                                compile.getClass();
                                z11 = compile.matcher(path).matches();
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                uri = next.getUri();
                                break;
                            }
                        } else {
                            uri = null;
                            break;
                        }
                    }
                    if (uri != null) {
                        DocumentFile fromTreeUri = DocumentFile.fromTreeUri(this, uri);
                        if (fromTreeUri != null && string.length() > 0) {
                            Iterator it2 = z7.n.A0(string, new String[]{"/"}).iterator();
                            while (it2.hasNext() && (fromTreeUri = fromTreeUri.findFile((String) it2.next())) != null) {
                            }
                        }
                        this.Y = fromTreeUri;
                        this.f4468c0 = null;
                    }
                } else {
                    this.f4468c0 = new File(string);
                    this.Y = null;
                }
            }
            if (extras.containsKey("select_path") && extras.getInt("select_path") == 1) {
                View findViewById = findViewById(R.id.ll_options);
                findViewById.getClass();
                View findViewById2 = findViewById(R.id.view_options_shadow);
                findViewById2.getClass();
                ((LinearLayout) findViewById).setVisibility(0);
                findViewById2.setVisibility(0);
                TextView textView = (TextView) findViewById(R.id.tv_select_current_dir);
                this.M = textView;
                if (textView != null) {
                    textView.setTypeface(s4.c.u);
                }
                TextView textView2 = this.M;
                if (textView2 != null) {
                    textView2.setOnClickListener(new f(this, 15));
                }
                TextView textView3 = (TextView) findViewById(R.id.tv_cancel);
                textView3.setTypeface(s4.c.u);
                textView3.setOnClickListener(new f(this, 16));
            }
        }
        this.T = (Toolbar) findViewById(R.id.toolbar);
        TextView textView4 = (TextView) findViewById(R.id.tv_toolbar_title);
        this.U = textView4;
        if (textView4 != null) {
            textView4.setText(getString(R.string.action_name_file_explorer));
        }
        TextView textView5 = this.U;
        if (textView5 != null) {
            textView5.setTypeface(s4.c.u);
        }
        Toolbar toolbar = this.T;
        if (toolbar != null) {
            toolbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.core_vector_menu_dots_blue));
        }
        Toolbar toolbar2 = this.T;
        if (toolbar2 != null) {
            toolbar2.setNavigationIcon(ContextCompat.getDrawable(this, R.drawable.core_vector_back));
        }
        Toolbar toolbar3 = this.T;
        if (toolbar3 != null) {
            toolbar3.setNavigationOnClickListener(new f(this, 17));
        }
        Toolbar toolbar4 = this.T;
        if (toolbar4 != null) {
            toolbar4.inflateMenu(R.menu.core_menu_file_explorer);
        }
        Toolbar toolbar5 = this.T;
        if (toolbar5 != null) {
            toolbar5.setOnMenuItemClickListener(new i(this));
        }
        U();
        View findViewById3 = findViewById(R.id.layout_breadcrumb_main);
        findViewById3.getClass();
        this.I = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(R.id.sv_breadcumb);
        findViewById4.getClass();
        this.J = (HorizontalScrollView) findViewById4;
        LinearLayout linearLayout = this.I;
        if (linearLayout != null) {
            View findViewById5 = linearLayout.findViewById(R.id.tv_main_path);
            findViewById5.getClass();
            this.E = (TextView) findViewById5;
            View findViewById6 = findViewById(R.id.iv_home_path);
            findViewById6.getClass();
            ((ImageView) findViewById6).setOnClickListener(new f(this, 18));
            TextView textView6 = this.E;
            if (textView6 != null) {
                textView6.setTypeface(s4.c.v);
                View findViewById7 = findViewById(R.id.tv_empty_dir);
                findViewById7.getClass();
                TextView textView7 = (TextView) findViewById7;
                this.K = textView7;
                textView7.setTypeface(s4.c.v);
                SearchView searchView = (SearchView) findViewById(R.id.search_view);
                this.N = searchView;
                if (searchView != null) {
                    searchView.setOnQueryTextListener(this.f4477n0);
                }
                SearchView searchView2 = this.N;
                if (searchView2 != null) {
                    searchView2.setOnClickListener(new f(this, i));
                }
                SearchView searchView3 = this.N;
                searchView3.getClass();
                ((ImageView) searchView3.findViewById(androidx.appcompat.R.id.search_close_btn)).setBackgroundResource(R.drawable.core_shape_transparent);
                SearchView searchView4 = this.N;
                searchView4.getClass();
                EditText editText = (EditText) searchView4.findViewById(androidx.appcompat.R.id.search_src_text);
                editText.setTypeface(s4.c.v);
                editText.setTextColor(ContextCompat.getColor(this, R.color.text_primary));
                editText.setHintTextColor(ContextCompat.getColor(this, R.color.core_search_view_color));
                ImageView imageView = (ImageView) findViewById(R.id.iv_search_options);
                imageView.getClass();
                int i8 = 2;
                imageView.setOnClickListener(new f(this, i8));
                this.O = (RelativeLayout) findViewById(R.id.rl_sort_options);
                RadioButton radioButton = (RadioButton) findViewById(R.id.rb_name_sort);
                this.P = radioButton;
                radioButton.getClass();
                radioButton.setTypeface(s4.c.v);
                RadioButton radioButton2 = this.P;
                radioButton2.getClass();
                radioButton2.setOnClickListener(new f(this, 3));
                RadioButton radioButton3 = this.P;
                radioButton3.getClass();
                radioButton3.setOnCheckedChangeListener(new h(this, i3));
                RadioButton radioButton4 = (RadioButton) findViewById(R.id.rb_size_sort);
                this.Q = radioButton4;
                radioButton4.getClass();
                radioButton4.setOnCheckedChangeListener(new h(this, i));
                RadioButton radioButton5 = (RadioButton) findViewById(R.id.rb_date_sort);
                this.R = radioButton5;
                radioButton5.getClass();
                radioButton5.setOnCheckedChangeListener(new h(this, i8));
                CheckBox checkBox = (CheckBox) findViewById(R.id.cb_show_hidden_files);
                checkBox.setTypeface(s4.c.v);
                try {
                    sharedPreferences = getSharedPreferences("CoreSettings", 0);
                } catch (Exception unused) {
                }
                if (sharedPreferences.contains("show_hidden_files")) {
                    z10 = sharedPreferences.getBoolean("show_hidden_files", false);
                    checkBox.setChecked(z10);
                    checkBox.setOnCheckedChangeListener(new h(this, 4));
                    Z();
                    View findViewById8 = findViewById(R.id.rv_files);
                    findViewById8.getClass();
                    RecyclerView recyclerView2 = (RecyclerView) findViewById8;
                    this.F = recyclerView2;
                    recyclerView2.setLayoutManager(new LinearLayoutManager(this, 1, false));
                    recyclerView = this.F;
                    if (recyclerView == null) {
                        recyclerView.addItemDecoration(new a5.s((int) getResources().getDimension(R.dimen.margin_generic_item_recyclerview)));
                        RecyclerView recyclerView3 = this.F;
                        if (recyclerView3 != null) {
                            recyclerView3.setItemAnimator(new DefaultItemAnimator());
                            View findViewById9 = findViewById(R.id.rl_loading_file_explorer);
                            findViewById9.getClass();
                            RelativeLayout relativeLayout = (RelativeLayout) findViewById9;
                            this.G = relativeLayout;
                            relativeLayout.setOnClickListener(new h5.o(26));
                            View findViewById10 = findViewById(R.id.ll_sd_permissions_explanation);
                            findViewById10.getClass();
                            this.H = (LinearLayout) findViewById10;
                            TextView textView8 = (TextView) findViewById(R.id.tv_storage_devices);
                            this.f4473i0 = textView8;
                            if (textView8 != null) {
                                textView8.setTypeface(s4.c.u);
                            }
                            TabLayout tabLayout = (TabLayout) findViewById(R.id.tl_storage);
                            this.h0 = tabLayout;
                            tabLayout.getClass();
                            TabLayout.Tab text = tabLayout.newTab().setText(getString(R.string.internal_storage));
                            text.getClass();
                            text.setId(0);
                            TabLayout tabLayout2 = this.h0;
                            tabLayout2.getClass();
                            tabLayout2.addTab(text);
                            TabLayout tabLayout3 = this.h0;
                            tabLayout3.getClass();
                            TabLayout.Tab text2 = tabLayout3.newTab().setText(getString(R.string.sd_card));
                            text2.getClass();
                            text2.setId(1);
                            TabLayout tabLayout4 = this.h0;
                            tabLayout4.getClass();
                            tabLayout4.addTab(text2);
                            TabLayout tabLayout5 = this.h0;
                            tabLayout5.getClass();
                            ViewGroupKt.get(tabLayout5, 0).setSelected(true);
                            TabLayout tabLayout6 = this.h0;
                            tabLayout6.getClass();
                            tabLayout6.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new t4.t(this));
                            if (l()) {
                                W(true);
                                ArrayList F = t1.F(this);
                                this.Z = F;
                                boolean isEmpty = F.isEmpty();
                                TabLayout tabLayout7 = this.h0;
                                if (isEmpty) {
                                    if (tabLayout7 != null) {
                                        tabLayout7.setVisibility(8);
                                    }
                                    TextView textView9 = this.f4473i0;
                                    if (textView9 != null) {
                                        textView9.setVisibility(8);
                                    }
                                } else {
                                    if (tabLayout7 != null) {
                                        tabLayout7.setVisibility(0);
                                    }
                                    TextView textView10 = this.f4473i0;
                                    if (textView10 != null) {
                                        textView10.setVisibility(0);
                                    }
                                }
                            } else {
                                AlertDialog alertDialog2 = this.f10585a;
                                if (alertDialog2 != null) {
                                    alertDialog2.dismiss();
                                }
                                View inflate = getLayoutInflater().inflate(R.layout.dialog_accept, (ViewGroup) null, false);
                                TextView textView11 = (TextView) inflate.findViewById(R.id.tv_dialog_accept_msg);
                                textView11.setTypeface(s4.c.v);
                                textView11.setText(getString(R.string.msg_request_permissions_write_external_storage));
                                TextView textView12 = (TextView) inflate.findViewById(R.id.tv_accept_option);
                                textView12.setTypeface(s4.c.u);
                                textView12.setOnClickListener(new f(this, i3));
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setView(inflate);
                                builder.setCancelable(false);
                                this.f10585a = builder.create();
                                if (!isFinishing() && (alertDialog = this.f10585a) != null) {
                                    alertDialog.show();
                                }
                            }
                            getOnBackPressedDispatcher().addCallback(this, this.f4478o0);
                            return;
                        }
                        p.i("rvFiles");
                        throw null;
                    }
                    p.i("rvFiles");
                    throw null;
                }
                z10 = false;
                checkBox.setChecked(z10);
                checkBox.setOnCheckedChangeListener(new h(this, 4));
                Z();
                View findViewById82 = findViewById(R.id.rv_files);
                findViewById82.getClass();
                RecyclerView recyclerView22 = (RecyclerView) findViewById82;
                this.F = recyclerView22;
                recyclerView22.setLayoutManager(new LinearLayoutManager(this, 1, false));
                recyclerView = this.F;
                if (recyclerView == null) {
                }
            } else {
                p.i("tvBreadCrumb");
                throw null;
            }
        } else {
            p.i("llBreadcrumb");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i == 82) {
            Toolbar toolbar = this.T;
            toolbar.getClass();
            toolbar.showOverflowMenu();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // t4.g
    public final void p() {
        i(getString(R.string.msg_permission_storage_denied));
    }

    @Override // t4.g
    public final void q() {
        Uri uri;
        boolean z10;
        List<UriPermission> persistedUriPermissions = getContentResolver().getPersistedUriPermissions();
        persistedUriPermissions.getClass();
        Iterator<UriPermission> it = persistedUriPermissions.iterator();
        while (true) {
            if (it.hasNext()) {
                UriPermission next = it.next();
                Uri uri2 = next.getUri();
                uri2.getClass();
                String path = uri2.getPath();
                if (path != null) {
                    Pattern compile = Pattern.compile(".*\\b[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]-[ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]][ABCDEF[0-9]]:.*");
                    compile.getClass();
                    z10 = compile.matcher(path).matches();
                } else {
                    z10 = false;
                }
                if (z10) {
                    uri = next.getUri();
                    break;
                }
            } else {
                uri = null;
                break;
            }
        }
        if (uri != null) {
            LinearLayout linearLayout = this.H;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                RecyclerView recyclerView = this.F;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                    this.Y = DocumentFile.fromTreeUri(this, uri);
                    this.f4468c0 = null;
                    W(true);
                    return;
                }
                p.i("rvFiles");
                throw null;
            }
            p.i("llPermissionExplanation");
            throw null;
        }
    }

    @Override // t4.g
    public final void r() {
        i(getString(R.string.core_error_wrong_sdcard_path));
    }

    @Override // t4.g
    public final void s() {
        i(getString(R.string.msg_permission_storage_denied));
    }

    @Override // t4.g
    public final void u() {
        W(true);
        if (!k()) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 645);
        }
    }
}
