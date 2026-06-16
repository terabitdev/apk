package com.uptodown.workers;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.i6;
import com.uptodown.UptodownApp;
import f8.l1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import javax.net.ssl.HttpsURLConnection;
import k5.j0;
import k5.k;
import k5.p2;
import k5.r;
import k5.r0;
import k5.r1;
import n5.d;
import o4.a0;
import o4.b1;
import s7.a;
import w5.g;
import w5.i;
import w5.j;
import w5.l;
import z1.b;
import z7.n;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public class DownloadWorker extends Worker {

    /* renamed from: a, reason: collision with root package name */
    public Context f4526a;

    /* renamed from: b, reason: collision with root package name */
    public a0 f4527b;

    /* renamed from: c, reason: collision with root package name */
    public String f4528c;

    /* renamed from: d, reason: collision with root package name */
    public r f4529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f4526a = context;
    }

    public static void g(InputStream inputStream, FileOutputStream fileOutputStream, HttpsURLConnection httpsURLConnection) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.flush();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        }
        if (b1.l(fileOutputStream)) {
            fileOutputStream.getFD().sync();
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
        httpsURLConnection.disconnect();
    }

    public static /* synthetic */ void i(DownloadWorker downloadWorker, long j, j0 j0Var) {
        downloadWorker.h(j, j0Var, ComposerKt.reuseKey);
    }

    public static long m(HttpsURLConnection httpsURLConnection) {
        if (Build.VERSION.SDK_INT >= 24) {
            return httpsURLConnection.getContentLengthLong();
        }
        return httpsURLConnection.getContentLength();
    }

    public static String n(String str) {
        int t02 = n.t0("/", str, 6);
        int t03 = n.t0(".", str, 6);
        if (t03 > t02) {
            String substring = str.substring(t03);
            if (substring.length() != 0) {
                return substring;
            }
        }
        return ".apk";
    }

    public static HttpsURLConnection w(URL url) {
        URLConnection openConnection = url.openConnection();
        openConnection.getClass();
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
        httpsURLConnection.setRequestProperty("Identificador", "Uptodown_Android");
        httpsURLConnection.setRequestProperty("Identificador-Version", "731");
        httpsURLConnection.setConnectTimeout(60000);
        httpsURLConnection.setReadTimeout(90000);
        return httpsURLConnection;
    }

    public void B(r rVar) {
        rVar.getClass();
    }

    public void C(int i, r rVar) {
        rVar.getClass();
    }

    public Bundle d(Bundle bundle, j0 j0Var) {
        String str;
        r rVar = this.f4529d;
        if (rVar != null && rVar.A == 1) {
            bundle.putInt("deeplink", 1);
        } else {
            k kVar = UptodownApp.f4380e0;
            if (kVar != null && rVar != null) {
                int i = kVar.f7423d;
                rVar.getClass();
                if (i == rVar.f7494a) {
                    bundle.putInt("deeplink", 1);
                }
            }
            bundle.putInt("deeplink", 0);
        }
        r1 B = b.B(this.f4526a);
        if (B != null) {
            r rVar2 = this.f4529d;
            if (rVar2 != null && B.f7504c == rVar2.f7494a) {
                bundle.putInt("notification_fcm", 1);
            } else {
                bundle.putInt("notification_fcm", 0);
            }
        }
        String str2 = this.f4528c;
        if (str2 != null) {
            bundle.putString("host", str2);
        }
        if (j0Var != null) {
            long j = j0Var.l;
            if (j > 0) {
                bundle.putString("fileId", String.valueOf(j));
            }
            long j10 = j0Var.f7412n;
            if (j10 > 0) {
                String str3 = "<10MB";
                if (j10 >= 10485760) {
                    if (j10 < 104857600) {
                        str3 = "<100MB";
                    } else if (j10 < 524288000) {
                        str3 = "<500MB";
                    } else if (j10 < 1073741824) {
                        str3 = "<1GB";
                    } else if (j10 < 10737418240L) {
                        str3 = "<10GB";
                    }
                }
                bundle.putString("size", str3);
            }
        }
        if (o() != null) {
            bundle.putInt("update", 1);
        } else {
            bundle.putInt("update", 0);
        }
        r rVar3 = this.f4529d;
        if (rVar3 != null && rVar3.q > 0) {
            rVar3.getClass();
            bundle.putString("appId", String.valueOf(rVar3.q));
        }
        r rVar4 = this.f4529d;
        if (rVar4 != null && rVar4.f7495b != null) {
            rVar4.getClass();
            bundle.putString("packagename", rVar4.f7495b);
        }
        if (a4.f3696e) {
            str = "wifi";
        } else {
            str = "mobile";
        }
        bundle.putString("connectionType", str);
        bundle.putLong("downBandwidthKbps", a4.f3694c);
        bundle.putLong("upBandwidthKbps", a4.f3695d);
        return bundle;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        ListenableWorker.Result failure = ListenableWorker.Result.failure();
        failure.getClass();
        return failure;
    }

    public final boolean e() {
        if (o() != null) {
            return a.l(this.f4526a);
        }
        return a4.f3696e;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle f(long j, long j10, File file, j0 j0Var) {
        long j11;
        Object obj;
        long j12;
        long j13;
        i iVar = i.f11205d;
        i iVar2 = i.f11203b;
        i iVar3 = i.f11204c;
        i iVar4 = i.f11202a;
        r rVar = this.f4529d;
        rVar.getClass();
        C(205, rVar);
        long length = file.length();
        long j14 = j0Var.f7412n;
        String str = j0Var.p;
        String absolutePath = file.getAbsolutePath();
        absolutePath.getClass();
        long j15 = 0;
        Bundle bundle = null;
        if (length <= 0) {
            obj = iVar4;
        } else {
            long j16 = j + j10;
            if (j14 != 0 && (j16 != j14 || length != j16)) {
                obj = iVar3;
            } else {
                boolean z10 = false;
                int i = 0;
                String str2 = null;
                while (true) {
                    j11 = j15;
                    if (z10 || i >= 3) {
                        break;
                    }
                    i++;
                    if (length == j16 && (str2 = a.a.C(absolutePath)) != null && str2.equalsIgnoreCase(str)) {
                        z10 = true;
                    }
                    j15 = j11;
                }
                if (str2 == null) {
                    obj = iVar2;
                } else if (!z10) {
                    obj = new j(str2);
                } else {
                    obj = iVar;
                }
                if (!obj.equals(iVar)) {
                    if (obj.equals(iVar4)) {
                        bundle = i6.k(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail", "error", "size_zero");
                    } else if (obj.equals(iVar3)) {
                        bundle = i6.k(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail", "error", "size_not_match");
                    } else if (obj.equals(iVar2)) {
                        bundle = b1.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail");
                        bundle.putString("filehash", j0Var.p);
                        bundle.putString("error", "filehash_calculated_null");
                    } else if (obj instanceof j) {
                        bundle = b1.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail");
                        bundle.putString("filehash", j0Var.p);
                        bundle.putString("filehashCalculated", ((j) obj).f11206a);
                        bundle.putString("error", "filehash_not_match");
                    } else {
                        o2.a.b();
                        return null;
                    }
                }
                r rVar2 = this.f4529d;
                rVar2.getClass();
                C(ComposerKt.referenceKey, rVar2);
                j12 = j0Var.l;
                if (j12 > j11 && bundle != null) {
                    bundle.putString("fileId", String.valueOf(j12));
                }
                j13 = j0Var.f7412n;
                if (j13 > j11 && bundle != null) {
                    String str3 = "<10MB";
                    if (j13 >= 10485760) {
                        if (j13 < 104857600) {
                            str3 = "<100MB";
                        } else if (j13 < 524288000) {
                            str3 = "<500MB";
                        } else if (j13 < 1073741824) {
                            str3 = "<1GB";
                        } else if (j13 < 10737418240L) {
                            str3 = "<10GB";
                        }
                    }
                    bundle.putString("size", str3);
                }
                return bundle;
            }
        }
        j11 = 0;
        if (!obj.equals(iVar)) {
        }
        r rVar22 = this.f4529d;
        rVar22.getClass();
        C(ComposerKt.referenceKey, rVar22);
        j12 = j0Var.l;
        if (j12 > j11) {
            bundle.putString("fileId", String.valueOf(j12));
        }
        j13 = j0Var.f7412n;
        if (j13 > j11) {
            String str32 = "<10MB";
            if (j13 >= 10485760) {
            }
            bundle.putString("size", str32);
        }
        return bundle;
    }

    public final void h(long j, j0 j0Var, int i) {
        r rVar = this.f4529d;
        if (rVar != null) {
            rVar.t(this.f4526a);
            g f7 = g.D.f(this.f4526a);
            f7.b();
            r rVar2 = this.f4529d;
            rVar2.getClass();
            boolean p = rVar2.p();
            r rVar3 = this.f4529d;
            if (p) {
                f7.n(rVar3);
            } else {
                rVar3.getClass();
                Iterator it = rVar3.F.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    j0 j0Var2 = (j0) next;
                    j0Var2.o = 0L;
                    j0Var2.r = 0;
                    f7.r0(j0Var2);
                }
            }
            f7.d();
            if (q()) {
                A();
            }
            Context context = this.f4526a;
            context.getClass();
            Object systemService = context.getSystemService("notification");
            systemService.getClass();
            ((NotificationManager) systemService).cancel(261);
            Bundle bundle = new Bundle();
            bundle.putString(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "cancelled");
            if (j > 0) {
                bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j) / 1000);
            }
            r(bundle, null, j0Var);
            r rVar4 = this.f4529d;
            rVar4.getClass();
            C(i, rVar4);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public final long k(javax.net.ssl.HttpsURLConnection r42, java.io.File r43, k5.r r44, k5.j0 r45, java.lang.String r46, long r47, b6.f r49) {
        /*
            Method dump skipped, instructions count: 1892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadWorker.k(javax.net.ssl.HttpsURLConnection, java.io.File, k5.r, k5.j0, java.lang.String, long, b6.f):long");
    }

    public final void l(j0 j0Var) {
        r(b1.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "first_data"), this.f4528c, j0Var);
    }

    public p2 o() {
        return null;
    }

    public boolean p() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public final void r(Bundle bundle, String str, j0 j0Var) {
        this.f4528c = str;
        Bundle d10 = d(bundle, j0Var);
        a0 a0Var = this.f4527b;
        if (a0Var != null) {
            a0Var.u(d10, "download");
        }
    }

    public final void s(long j, long j10, long j11, long j12, j0 j0Var) {
        Bundle f7 = b1.f(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "completed");
        if (j == 0) {
            long currentTimeMillis = (System.currentTimeMillis() - j11) / 1000;
            if (currentTimeMillis > 0) {
                j = j12 / currentTimeMillis;
            }
        }
        f7.putLong("speed", j);
        f7.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j10) / 1000);
        r(f7, this.f4528c, j0Var);
    }

    public void t(p2 p2Var, r rVar, j0 j0Var, Bundle bundle, String str, long j) {
        rVar.getClass();
    }

    public final void u(int i) {
        if (this.f4529d != null) {
            Data.Builder builder = new Data.Builder();
            builder.putInt("downloadProgress", i);
            setProgressAsync(builder.build());
            if (o() == null) {
                l.c(this.f4526a);
            }
            r rVar = this.f4529d;
            rVar.getClass();
            C(ComposerKt.providerKey, rVar);
        }
    }

    public final boolean v(HttpsURLConnection httpsURLConnection, long j) {
        httpsURLConnection.connect();
        int responseCode = httpsURLConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return true;
        }
        Bundle k10 = i6.k(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail", "error", NotificationCompat.CATEGORY_STATUS);
        k10.putString("responseCode", String.valueOf(responseCode));
        k10.putString("url", httpsURLConnection.getURL().toString());
        if (o() != null) {
            k10.putInt("update", 1);
        } else {
            k10.putInt("update", 0);
        }
        j(k10, " (105)", j);
        return false;
    }

    public final void x(r rVar, j0 j0Var, String str, String str2, long j, String str3) {
        p2 o = o();
        if (o != null) {
            l1 l1Var = d.f8324a;
            d.f8326c.c(new r0(o.s));
            Bundle bundle = new Bundle();
            bundle.putString("exception", str);
            bundle.putString("url", str3);
            t(o, rVar, j0Var, bundle, str2, j);
            return;
        }
        Bundle k10 = i6.k("exception", str, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "fail");
        k10.putString("url", str3);
        j(k10, " (109)", j);
    }

    public final void y(String str, Bundle bundle, long j, r rVar) {
        if (rVar != null) {
            rVar.l(this.f4526a);
            B(rVar);
            if (rVar.p()) {
                l.i(this.f4526a, rVar, str);
            }
        }
        if (j > 0) {
            bundle.putLong(TypedValues.TransitionType.S_DURATION, (System.currentTimeMillis() - j) / 1000);
        }
        Bundle d10 = d(bundle, null);
        a0 a0Var = this.f4527b;
        if (a0Var != null) {
            a0Var.u(d10, "download");
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final javax.net.ssl.HttpsURLConnection z(java.lang.String r19, long r20, k5.j0 r22) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.workers.DownloadWorker.z(java.lang.String, long, k5.j0):javax.net.ssl.HttpsURLConnection");
    }

    public void A() {
    }

    public void j(Bundle bundle, String str, long j) {
    }
}
