package com.uptodown.workers;

import a5.h;
import a5.j;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Debug;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import b.d;
import b6.q;
import b6.s;
import c7.l;
import c7.z;
import c8.f0;
import c8.j0;
import c8.p0;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.l5;
import com.uptodown.UptodownApp;
import f5.i;
import f5.s0;
import h7.a;
import j8.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k5.g2;
import k5.l2;
import k5.p;
import m5.f;
import o4.a0;
import org.json.JSONObject;
import s4.c;
import z1.b;
import z7.v;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TrackingWorker extends CoroutineWorker {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4542a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4543b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4544c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4545d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4546e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f4547f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f4542a = context;
        this.f4543b = workerParameters.getInputData().getBoolean("isCompressed", true);
        this.f4547f = new a0(context, 22);
        Activity activity = c.o;
        this.f4542a = b.j(context);
        for (String str : getTags()) {
            if (str.equals("TrackingWorkerPeriodic") || str.equals("TrackingWorkerSingle")) {
                this.f4546e = str;
            }
        }
    }

    public static String c(String str) {
        if (v.a0(str, "TrackingWorkerPeriodic", true)) {
            return "periodic";
        }
        return "oneTime";
    }

    public final void b(g2 g2Var) {
        int i = g2Var.f7390b;
        if (i == 401) {
            this.f4544c = true;
        } else if (i == 0) {
            this.f4544c = true;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(2:9|(2:11|(2:13|(2:15|(2:17|(2:19|20)(2:22|23))(6:24|25|26|27|(1:29)(1:32)|(1:31)(1:20)))(8:33|34|35|36|(2:38|(2:40|31))|27|(0)(0)|(0)(0)))(5:41|42|43|44|(5:46|(4:48|(2:50|(2:52|31))|36|(0))|27|(0)(0)|(0)(0))(2:53|54)))(3:55|56|57))(3:143|144|(5:146|(1:148)(2:175|(2:183|(3:185|(1:187)|188)(2:189|190))(3:179|(1:181)|182))|(6:150|(1:152)(1:171)|153|(3:160|(2:162|(1:164))|20)|169|170)(2:172|(1:174))|165|(2:167|31)(1:168))(2:191|192))|58|(4:61|(3:66|67|68)|69|59)|72|73|(2:75|(4:77|(3:84|(9:86|(2:88|(12:90|(1:92)(1:128)|(2:116|(2:122|(2:124|125)(2:126|127))(1:120))|96|97|98|99|100|(3:102|(3:104|(1:106)(1:110)|(2:108|31)(2:109|44))|(0)(0))|112|(0)|(0)(0)))|129|(0)(0)|(1:94)|116|(1:118)|122|(0)(0))|20)|130|(8:132|129|(0)(0)|(0)|116|(0)|122|(0)(0))(2:133|134))(2:135|136))(2:137|(2:139|140)(2:141|142))))|195|6|7|(0)(0)|58|(1:59)|72|73|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02ca, code lost:
    
        if (new org.json.JSONObject(r3).optInt("success") == 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x005e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0432, code lost:
    
        r0.printStackTrace();
        new o4.a0(r15, 22).w("trackingWorker", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e7 A[Catch: Exception -> 0x005e, TRY_ENTER, TryCatch #0 {Exception -> 0x005e, blocks: (B:19:0x0059, B:25:0x006b, B:27:0x03b3, B:34:0x007c, B:36:0x0381, B:38:0x0399, B:42:0x0086, B:46:0x031b, B:48:0x0361, B:50:0x0369, B:53:0x03dc, B:54:0x03e1, B:56:0x0093, B:58:0x01e3, B:59:0x01f3, B:61:0x01f9, B:64:0x0206, B:67:0x020a, B:73:0x020e, B:75:0x0217, B:77:0x0246, B:79:0x0253, B:81:0x0257, B:84:0x025e, B:86:0x026f, B:88:0x0277, B:90:0x027f, B:92:0x028f, B:94:0x0297, B:104:0x02e7, B:116:0x029d, B:118:0x02b8, B:120:0x02bc, B:122:0x03e2, B:124:0x03e8, B:126:0x03f4, B:130:0x0286, B:133:0x03f8, B:135:0x03fc, B:136:0x0401, B:137:0x0402, B:139:0x041a, B:141:0x0423, B:142:0x0427, B:144:0x00a9, B:146:0x00b8, B:150:0x0158, B:152:0x0176, B:153:0x0182, B:155:0x0192, B:157:0x0196, B:160:0x019d, B:162:0x01ae, B:164:0x01b8, B:165:0x01cd, B:169:0x01c2, B:171:0x017b, B:174:0x01ca, B:175:0x00fe, B:177:0x0120, B:179:0x0126, B:181:0x012d, B:182:0x0137, B:183:0x0145, B:185:0x014b, B:187:0x0152, B:189:0x0428, B:191:0x042c, B:192:0x0431), top: B:7:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b8 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:19:0x0059, B:25:0x006b, B:27:0x03b3, B:34:0x007c, B:36:0x0381, B:38:0x0399, B:42:0x0086, B:46:0x031b, B:48:0x0361, B:50:0x0369, B:53:0x03dc, B:54:0x03e1, B:56:0x0093, B:58:0x01e3, B:59:0x01f3, B:61:0x01f9, B:64:0x0206, B:67:0x020a, B:73:0x020e, B:75:0x0217, B:77:0x0246, B:79:0x0253, B:81:0x0257, B:84:0x025e, B:86:0x026f, B:88:0x0277, B:90:0x027f, B:92:0x028f, B:94:0x0297, B:104:0x02e7, B:116:0x029d, B:118:0x02b8, B:120:0x02bc, B:122:0x03e2, B:124:0x03e8, B:126:0x03f4, B:130:0x0286, B:133:0x03f8, B:135:0x03fc, B:136:0x0401, B:137:0x0402, B:139:0x041a, B:141:0x0423, B:142:0x0427, B:144:0x00a9, B:146:0x00b8, B:150:0x0158, B:152:0x0176, B:153:0x0182, B:155:0x0192, B:157:0x0196, B:160:0x019d, B:162:0x01ae, B:164:0x01b8, B:165:0x01cd, B:169:0x01c2, B:171:0x017b, B:174:0x01ca, B:175:0x00fe, B:177:0x0120, B:179:0x0126, B:181:0x012d, B:182:0x0137, B:183:0x0145, B:185:0x014b, B:187:0x0152, B:189:0x0428, B:191:0x042c, B:192:0x0431), top: B:7:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e8 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:19:0x0059, B:25:0x006b, B:27:0x03b3, B:34:0x007c, B:36:0x0381, B:38:0x0399, B:42:0x0086, B:46:0x031b, B:48:0x0361, B:50:0x0369, B:53:0x03dc, B:54:0x03e1, B:56:0x0093, B:58:0x01e3, B:59:0x01f3, B:61:0x01f9, B:64:0x0206, B:67:0x020a, B:73:0x020e, B:75:0x0217, B:77:0x0246, B:79:0x0253, B:81:0x0257, B:84:0x025e, B:86:0x026f, B:88:0x0277, B:90:0x027f, B:92:0x028f, B:94:0x0297, B:104:0x02e7, B:116:0x029d, B:118:0x02b8, B:120:0x02bc, B:122:0x03e2, B:124:0x03e8, B:126:0x03f4, B:130:0x0286, B:133:0x03f8, B:135:0x03fc, B:136:0x0401, B:137:0x0402, B:139:0x041a, B:141:0x0423, B:142:0x0427, B:144:0x00a9, B:146:0x00b8, B:150:0x0158, B:152:0x0176, B:153:0x0182, B:155:0x0192, B:157:0x0196, B:160:0x019d, B:162:0x01ae, B:164:0x01b8, B:165:0x01cd, B:169:0x01c2, B:171:0x017b, B:174:0x01ca, B:175:0x00fe, B:177:0x0120, B:179:0x0126, B:181:0x012d, B:182:0x0137, B:183:0x0145, B:185:0x014b, B:187:0x0152, B:189:0x0428, B:191:0x042c, B:192:0x0431), top: B:7:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03f4 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:19:0x0059, B:25:0x006b, B:27:0x03b3, B:34:0x007c, B:36:0x0381, B:38:0x0399, B:42:0x0086, B:46:0x031b, B:48:0x0361, B:50:0x0369, B:53:0x03dc, B:54:0x03e1, B:56:0x0093, B:58:0x01e3, B:59:0x01f3, B:61:0x01f9, B:64:0x0206, B:67:0x020a, B:73:0x020e, B:75:0x0217, B:77:0x0246, B:79:0x0253, B:81:0x0257, B:84:0x025e, B:86:0x026f, B:88:0x0277, B:90:0x027f, B:92:0x028f, B:94:0x0297, B:104:0x02e7, B:116:0x029d, B:118:0x02b8, B:120:0x02bc, B:122:0x03e2, B:124:0x03e8, B:126:0x03f4, B:130:0x0286, B:133:0x03f8, B:135:0x03fc, B:136:0x0401, B:137:0x0402, B:139:0x041a, B:141:0x0423, B:142:0x0427, B:144:0x00a9, B:146:0x00b8, B:150:0x0158, B:152:0x0176, B:153:0x0182, B:155:0x0192, B:157:0x0196, B:160:0x019d, B:162:0x01ae, B:164:0x01b8, B:165:0x01cd, B:169:0x01c2, B:171:0x017b, B:174:0x01ca, B:175:0x00fe, B:177:0x0120, B:179:0x0126, B:181:0x012d, B:182:0x0137, B:183:0x0145, B:185:0x014b, B:187:0x0152, B:189:0x0428, B:191:0x042c, B:192:0x0431), top: B:7:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0402 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:19:0x0059, B:25:0x006b, B:27:0x03b3, B:34:0x007c, B:36:0x0381, B:38:0x0399, B:42:0x0086, B:46:0x031b, B:48:0x0361, B:50:0x0369, B:53:0x03dc, B:54:0x03e1, B:56:0x0093, B:58:0x01e3, B:59:0x01f3, B:61:0x01f9, B:64:0x0206, B:67:0x020a, B:73:0x020e, B:75:0x0217, B:77:0x0246, B:79:0x0253, B:81:0x0257, B:84:0x025e, B:86:0x026f, B:88:0x0277, B:90:0x027f, B:92:0x028f, B:94:0x0297, B:104:0x02e7, B:116:0x029d, B:118:0x02b8, B:120:0x02bc, B:122:0x03e2, B:124:0x03e8, B:126:0x03f4, B:130:0x0286, B:133:0x03f8, B:135:0x03fc, B:136:0x0401, B:137:0x0402, B:139:0x041a, B:141:0x0423, B:142:0x0427, B:144:0x00a9, B:146:0x00b8, B:150:0x0158, B:152:0x0176, B:153:0x0182, B:155:0x0192, B:157:0x0196, B:160:0x019d, B:162:0x01ae, B:164:0x01b8, B:165:0x01cd, B:169:0x01c2, B:171:0x017b, B:174:0x01ca, B:175:0x00fe, B:177:0x0120, B:179:0x0126, B:181:0x012d, B:182:0x0137, B:183:0x0145, B:185:0x014b, B:187:0x0152, B:189:0x0428, B:191:0x042c, B:192:0x0431), top: B:7:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0441 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03db A[PHI: r4
      0x03db: PHI (r4v28 h7.a) = (r4v10 h7.a), (r4v21 h7.a), (r4v25 h7.a), (r4v27 h7.a), (r4v29 h7.a) binds: [B:167:0x01e0, B:108:0x0313, B:52:0x0380, B:40:0x03b2, B:30:0x03d9] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0399 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:19:0x0059, B:25:0x006b, B:27:0x03b3, B:34:0x007c, B:36:0x0381, B:38:0x0399, B:42:0x0086, B:46:0x031b, B:48:0x0361, B:50:0x0369, B:53:0x03dc, B:54:0x03e1, B:56:0x0093, B:58:0x01e3, B:59:0x01f3, B:61:0x01f9, B:64:0x0206, B:67:0x020a, B:73:0x020e, B:75:0x0217, B:77:0x0246, B:79:0x0253, B:81:0x0257, B:84:0x025e, B:86:0x026f, B:88:0x0277, B:90:0x027f, B:92:0x028f, B:94:0x0297, B:104:0x02e7, B:116:0x029d, B:118:0x02b8, B:120:0x02bc, B:122:0x03e2, B:124:0x03e8, B:126:0x03f4, B:130:0x0286, B:133:0x03f8, B:135:0x03fc, B:136:0x0401, B:137:0x0402, B:139:0x041a, B:141:0x0423, B:142:0x0427, B:144:0x00a9, B:146:0x00b8, B:150:0x0158, B:152:0x0176, B:153:0x0182, B:155:0x0192, B:157:0x0196, B:160:0x019d, B:162:0x01ae, B:164:0x01b8, B:165:0x01cd, B:169:0x01c2, B:171:0x017b, B:174:0x01ca, B:175:0x00fe, B:177:0x0120, B:179:0x0126, B:181:0x012d, B:182:0x0137, B:183:0x0145, B:185:0x014b, B:187:0x0152, B:189:0x0428, B:191:0x042c, B:192:0x0431), top: B:7:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x031b A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:19:0x0059, B:25:0x006b, B:27:0x03b3, B:34:0x007c, B:36:0x0381, B:38:0x0399, B:42:0x0086, B:46:0x031b, B:48:0x0361, B:50:0x0369, B:53:0x03dc, B:54:0x03e1, B:56:0x0093, B:58:0x01e3, B:59:0x01f3, B:61:0x01f9, B:64:0x0206, B:67:0x020a, B:73:0x020e, B:75:0x0217, B:77:0x0246, B:79:0x0253, B:81:0x0257, B:84:0x025e, B:86:0x026f, B:88:0x0277, B:90:0x027f, B:92:0x028f, B:94:0x0297, B:104:0x02e7, B:116:0x029d, B:118:0x02b8, B:120:0x02bc, B:122:0x03e2, B:124:0x03e8, B:126:0x03f4, B:130:0x0286, B:133:0x03f8, B:135:0x03fc, B:136:0x0401, B:137:0x0402, B:139:0x041a, B:141:0x0423, B:142:0x0427, B:144:0x00a9, B:146:0x00b8, B:150:0x0158, B:152:0x0176, B:153:0x0182, B:155:0x0192, B:157:0x0196, B:160:0x019d, B:162:0x01ae, B:164:0x01b8, B:165:0x01cd, B:169:0x01c2, B:171:0x017b, B:174:0x01ca, B:175:0x00fe, B:177:0x0120, B:179:0x0126, B:181:0x012d, B:182:0x0137, B:183:0x0145, B:185:0x014b, B:187:0x0152, B:189:0x0428, B:191:0x042c, B:192:0x0431), top: B:7:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03dc A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:19:0x0059, B:25:0x006b, B:27:0x03b3, B:34:0x007c, B:36:0x0381, B:38:0x0399, B:42:0x0086, B:46:0x031b, B:48:0x0361, B:50:0x0369, B:53:0x03dc, B:54:0x03e1, B:56:0x0093, B:58:0x01e3, B:59:0x01f3, B:61:0x01f9, B:64:0x0206, B:67:0x020a, B:73:0x020e, B:75:0x0217, B:77:0x0246, B:79:0x0253, B:81:0x0257, B:84:0x025e, B:86:0x026f, B:88:0x0277, B:90:0x027f, B:92:0x028f, B:94:0x0297, B:104:0x02e7, B:116:0x029d, B:118:0x02b8, B:120:0x02bc, B:122:0x03e2, B:124:0x03e8, B:126:0x03f4, B:130:0x0286, B:133:0x03f8, B:135:0x03fc, B:136:0x0401, B:137:0x0402, B:139:0x041a, B:141:0x0423, B:142:0x0427, B:144:0x00a9, B:146:0x00b8, B:150:0x0158, B:152:0x0176, B:153:0x0182, B:155:0x0192, B:157:0x0196, B:160:0x019d, B:162:0x01ae, B:164:0x01b8, B:165:0x01cd, B:169:0x01c2, B:171:0x017b, B:174:0x01ca, B:175:0x00fe, B:177:0x0120, B:179:0x0126, B:181:0x012d, B:182:0x0137, B:183:0x0145, B:185:0x014b, B:187:0x0152, B:189:0x0428, B:191:0x042c, B:192:0x0431), top: B:7:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f9 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:19:0x0059, B:25:0x006b, B:27:0x03b3, B:34:0x007c, B:36:0x0381, B:38:0x0399, B:42:0x0086, B:46:0x031b, B:48:0x0361, B:50:0x0369, B:53:0x03dc, B:54:0x03e1, B:56:0x0093, B:58:0x01e3, B:59:0x01f3, B:61:0x01f9, B:64:0x0206, B:67:0x020a, B:73:0x020e, B:75:0x0217, B:77:0x0246, B:79:0x0253, B:81:0x0257, B:84:0x025e, B:86:0x026f, B:88:0x0277, B:90:0x027f, B:92:0x028f, B:94:0x0297, B:104:0x02e7, B:116:0x029d, B:118:0x02b8, B:120:0x02bc, B:122:0x03e2, B:124:0x03e8, B:126:0x03f4, B:130:0x0286, B:133:0x03f8, B:135:0x03fc, B:136:0x0401, B:137:0x0402, B:139:0x041a, B:141:0x0423, B:142:0x0427, B:144:0x00a9, B:146:0x00b8, B:150:0x0158, B:152:0x0176, B:153:0x0182, B:155:0x0192, B:157:0x0196, B:160:0x019d, B:162:0x01ae, B:164:0x01b8, B:165:0x01cd, B:169:0x01c2, B:171:0x017b, B:174:0x01ca, B:175:0x00fe, B:177:0x0120, B:179:0x0126, B:181:0x012d, B:182:0x0137, B:183:0x0145, B:185:0x014b, B:187:0x0152, B:189:0x0428, B:191:0x042c, B:192:0x0431), top: B:7:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0217 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:19:0x0059, B:25:0x006b, B:27:0x03b3, B:34:0x007c, B:36:0x0381, B:38:0x0399, B:42:0x0086, B:46:0x031b, B:48:0x0361, B:50:0x0369, B:53:0x03dc, B:54:0x03e1, B:56:0x0093, B:58:0x01e3, B:59:0x01f3, B:61:0x01f9, B:64:0x0206, B:67:0x020a, B:73:0x020e, B:75:0x0217, B:77:0x0246, B:79:0x0253, B:81:0x0257, B:84:0x025e, B:86:0x026f, B:88:0x0277, B:90:0x027f, B:92:0x028f, B:94:0x0297, B:104:0x02e7, B:116:0x029d, B:118:0x02b8, B:120:0x02bc, B:122:0x03e2, B:124:0x03e8, B:126:0x03f4, B:130:0x0286, B:133:0x03f8, B:135:0x03fc, B:136:0x0401, B:137:0x0402, B:139:0x041a, B:141:0x0423, B:142:0x0427, B:144:0x00a9, B:146:0x00b8, B:150:0x0158, B:152:0x0176, B:153:0x0182, B:155:0x0192, B:157:0x0196, B:160:0x019d, B:162:0x01ae, B:164:0x01b8, B:165:0x01cd, B:169:0x01c2, B:171:0x017b, B:174:0x01ca, B:175:0x00fe, B:177:0x0120, B:179:0x0126, B:181:0x012d, B:182:0x0137, B:183:0x0145, B:185:0x014b, B:187:0x0152, B:189:0x0428, B:191:0x042c, B:192:0x0431), top: B:7:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028f A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:19:0x0059, B:25:0x006b, B:27:0x03b3, B:34:0x007c, B:36:0x0381, B:38:0x0399, B:42:0x0086, B:46:0x031b, B:48:0x0361, B:50:0x0369, B:53:0x03dc, B:54:0x03e1, B:56:0x0093, B:58:0x01e3, B:59:0x01f3, B:61:0x01f9, B:64:0x0206, B:67:0x020a, B:73:0x020e, B:75:0x0217, B:77:0x0246, B:79:0x0253, B:81:0x0257, B:84:0x025e, B:86:0x026f, B:88:0x0277, B:90:0x027f, B:92:0x028f, B:94:0x0297, B:104:0x02e7, B:116:0x029d, B:118:0x02b8, B:120:0x02bc, B:122:0x03e2, B:124:0x03e8, B:126:0x03f4, B:130:0x0286, B:133:0x03f8, B:135:0x03fc, B:136:0x0401, B:137:0x0402, B:139:0x041a, B:141:0x0423, B:142:0x0427, B:144:0x00a9, B:146:0x00b8, B:150:0x0158, B:152:0x0176, B:153:0x0182, B:155:0x0192, B:157:0x0196, B:160:0x019d, B:162:0x01ae, B:164:0x01b8, B:165:0x01cd, B:169:0x01c2, B:171:0x017b, B:174:0x01ca, B:175:0x00fe, B:177:0x0120, B:179:0x0126, B:181:0x012d, B:182:0x0137, B:183:0x0145, B:185:0x014b, B:187:0x0152, B:189:0x0428, B:191:0x042c, B:192:0x0431), top: B:7:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0297 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:19:0x0059, B:25:0x006b, B:27:0x03b3, B:34:0x007c, B:36:0x0381, B:38:0x0399, B:42:0x0086, B:46:0x031b, B:48:0x0361, B:50:0x0369, B:53:0x03dc, B:54:0x03e1, B:56:0x0093, B:58:0x01e3, B:59:0x01f3, B:61:0x01f9, B:64:0x0206, B:67:0x020a, B:73:0x020e, B:75:0x0217, B:77:0x0246, B:79:0x0253, B:81:0x0257, B:84:0x025e, B:86:0x026f, B:88:0x0277, B:90:0x027f, B:92:0x028f, B:94:0x0297, B:104:0x02e7, B:116:0x029d, B:118:0x02b8, B:120:0x02bc, B:122:0x03e2, B:124:0x03e8, B:126:0x03f4, B:130:0x0286, B:133:0x03f8, B:135:0x03fc, B:136:0x0401, B:137:0x0402, B:139:0x041a, B:141:0x0423, B:142:0x0427, B:144:0x00a9, B:146:0x00b8, B:150:0x0158, B:152:0x0176, B:153:0x0182, B:155:0x0192, B:157:0x0196, B:160:0x019d, B:162:0x01ae, B:164:0x01b8, B:165:0x01cd, B:169:0x01c2, B:171:0x017b, B:174:0x01ca, B:175:0x00fe, B:177:0x0120, B:179:0x0126, B:181:0x012d, B:182:0x0137, B:183:0x0145, B:185:0x014b, B:187:0x0152, B:189:0x0428, B:191:0x042c, B:192:0x0431), top: B:7:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /* JADX WARN: Type inference failed for: r3v50, types: [a6.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, k5.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(i7.c cVar) {
        s sVar;
        int i;
        String str;
        boolean z10;
        String str2;
        w5.s sVar2;
        String str3;
        String str4;
        int i3;
        String str5;
        a aVar;
        int i8;
        g2 k10;
        String str6;
        p pVar;
        ArrayList arrayList;
        Iterator it;
        String str7;
        String str8;
        g2 G;
        String str9;
        boolean z11;
        int i10;
        p pVar2;
        SharedPreferences sharedPreferences;
        String str10;
        boolean v;
        Object K;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i11 = sVar.p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sVar.p = i11 - Integer.MIN_VALUE;
                Object obj = sVar.f3343n;
                i = sVar.p;
                a aVar2 = a.f6117a;
                boolean z12 = this.f4543b;
                String str11 = this.f4546e;
                a0 a0Var = this.f4547f;
                z zVar = z.f3538a;
                Context context = this.f4542a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5) {
                                        c7.a.e(obj);
                                        return zVar;
                                    }
                                    d.j("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                v = sVar.m;
                                i8 = sVar.l;
                                c7.a.e(obj);
                                ((l) obj).getClass();
                                aVar = aVar2;
                                s0 s0Var = new s0(context);
                                sVar.f3341a = null;
                                sVar.f3342b = null;
                                sVar.l = i8;
                                sVar.m = v;
                                sVar.p = 5;
                                e eVar = p0.f3588a;
                                K = f0.K(j8.d.f7053a, new h(s0Var, (g7.c) null, 14), sVar);
                                if (K != aVar) {
                                    K = zVar;
                                }
                                if (K == aVar) {
                                    return aVar;
                                }
                                return zVar;
                            }
                            v = sVar.m;
                            i8 = sVar.l;
                            c7.a.e(obj);
                            aVar = aVar2;
                            context.getClass();
                            if (s7.a.x(0L, context, "last_analysis_timestamp") + 7200000 < System.currentTimeMillis()) {
                                ?? obj2 = new Object();
                                obj2.f235a = context;
                                sVar.f3341a = null;
                                sVar.f3342b = null;
                                sVar.l = i8;
                                sVar.m = v;
                                sVar.p = 4;
                                if (obj2.b(sVar) == aVar) {
                                    return aVar;
                                }
                            }
                            s0 s0Var2 = new s0(context);
                            sVar.f3341a = null;
                            sVar.f3342b = null;
                            sVar.l = i8;
                            sVar.m = v;
                            sVar.p = 5;
                            e eVar2 = p0.f3588a;
                            K = f0.K(j8.d.f7053a, new h(s0Var2, (g7.c) null, 14), sVar);
                            if (K != aVar) {
                            }
                            if (K == aVar) {
                            }
                        } else {
                            i10 = sVar.l;
                            pVar2 = sVar.f3341a;
                            c7.a.e(obj);
                            str9 = "is_status_code_526";
                            aVar = aVar2;
                            pVar = pVar2;
                            i8 = i10;
                            if (str11 != null) {
                                String c10 = c(str11);
                                context.getClass();
                                WorkManager.Companion.getInstance(context).enqueueUniqueWork("GetUpdatesWorker", ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) GetUpdatesWorker.class).addTag("GetUpdatesWorker").setInputData(new Data.Builder().putString("source", c10).build()).build());
                                this.f4545d = true;
                                v = s7.a.v(context, str9, false);
                                if (!v) {
                                    if (!s7.a.v(context, "settings_utd_sended", false)) {
                                        l2 l2Var = new l2(context);
                                        sVar.f3341a = null;
                                        sVar.f3342b = null;
                                        sVar.l = i8;
                                        sVar.m = v;
                                        sVar.p = 3;
                                        if (l2Var.a(context, pVar, sVar) == aVar) {
                                            return aVar;
                                        }
                                    }
                                    context.getClass();
                                    if (s7.a.x(0L, context, "last_analysis_timestamp") + 7200000 < System.currentTimeMillis()) {
                                    }
                                }
                                s0 s0Var22 = new s0(context);
                                sVar.f3341a = null;
                                sVar.f3342b = null;
                                sVar.l = i8;
                                sVar.m = v;
                                sVar.p = 5;
                                e eVar22 = p0.f3588a;
                                K = f0.K(j8.d.f7053a, new h(s0Var22, (g7.c) null, 14), sVar);
                                if (K != aVar) {
                                }
                                if (K == aVar) {
                                }
                            } else {
                                kotlin.jvm.internal.p.i("currentTag");
                                throw null;
                            }
                        }
                    } else {
                        i8 = sVar.l;
                        w5.s sVar3 = sVar.f3342b;
                        p pVar3 = sVar.f3341a;
                        c7.a.e(obj);
                        str2 = "sha256Status";
                        str = "is_status_code_526";
                        str4 = ShareTarget.METHOD_GET;
                        str5 = "https://t.uptodown.app:443";
                        z10 = z12;
                        sVar2 = sVar3;
                        aVar = aVar2;
                        pVar = pVar3;
                    }
                } else {
                    g7.c cVar2 = null;
                    c7.a.e(obj);
                    f fVar = UptodownApp.f4376a0;
                    str = "is_status_code_526";
                    fVar.send(600, null);
                    if (str11 != null) {
                        z10 = z12;
                        a0Var.x("start", null, null, c(str11));
                        e eVar3 = p0.f3588a;
                        str2 = "sha256Status";
                        j0 e10 = f0.e(f0.b(j8.d.f7053a), new h(this, cVar2, 5));
                        ?? obj3 = new Object();
                        obj3.g(context);
                        int i12 = m5.c.f7913a;
                        sVar2 = new w5.s(context, 0);
                        String a10 = obj3.a();
                        String z13 = s7.a.z(context, "device_status");
                        if (v.a0(a10, z13, true)) {
                            str4 = ShareTarget.METHOD_GET;
                            str3 = z13;
                            i3 = 0;
                        } else {
                            String str12 = obj3.f7469a;
                            str12.getClass();
                            str3 = z13;
                            g2 k11 = sVar2.k("https://t.uptodown.app:443/eapi/v2/tracker/device/".concat(str12), null, ShareTarget.METHOD_GET, false);
                            str4 = ShareTarget.METHOD_GET;
                            a0Var.x("getDevice", null, k11, c(str11));
                            if (sVar2.c(k11) && k11.f7390b == 200) {
                                if (!s7.a.v(context, "is_device_tracking_registered", false)) {
                                    s7.a.M(context, "is_device_tracking_registered", true);
                                    fVar.send(TypedValues.MotionType.TYPE_EASING, null);
                                }
                                String str13 = k11.f7389a;
                                str13.getClass();
                                i3 = !obj3.b(str13) ? 1 : 0;
                            } else if (k11.f7390b == 404) {
                                if (s7.a.v(context, "is_device_tracking_registered", false)) {
                                    s7.a.M(context, "is_device_tracking_registered", false);
                                }
                                i3 = 1;
                            } else {
                                b(k11);
                                return zVar;
                            }
                        }
                        if (i3 == 0) {
                            str5 = "https://t.uptodown.app:443";
                            if (str3 == null) {
                                s7.a.S(context, "device_status", a10);
                            }
                        } else {
                            JSONObject h = obj3.h();
                            String concat = "https://t.uptodown.app:443".concat("/eapi/v2/tracker/device");
                            HashMap hashMap = new HashMap();
                            str5 = "https://t.uptodown.app:443";
                            hashMap.put("device", h.toString());
                            if (z10) {
                                k10 = sVar2.l(concat, hashMap);
                            } else {
                                k10 = sVar2.k(concat, hashMap, ShareTarget.METHOD_POST, false);
                            }
                            a0Var.x("saveDevice", null, k10, c(str11));
                            if (sVar2.c(k10) && (str6 = k10.f7389a) != null && str6.length() != 0) {
                                String str14 = k10.f7389a;
                                str14.getClass();
                                if (new JSONObject(str14).optInt("success") == 1) {
                                    s7.a.S(context, "device_status", a10);
                                    if (!s7.a.v(context, "is_device_tracking_registered", false)) {
                                        s7.a.M(context, "is_device_tracking_registered", true);
                                        fVar.send(TypedValues.MotionType.TYPE_EASING, null);
                                    }
                                }
                                return zVar;
                            }
                            b(k10);
                            return zVar;
                        }
                        sVar.f3341a = obj3;
                        sVar.f3342b = sVar2;
                        sVar.l = i3;
                        sVar.p = 1;
                        aVar = aVar2;
                        if (e10.u(sVar) != aVar) {
                            i8 = i3;
                            pVar = obj3;
                        } else {
                            return aVar;
                        }
                    } else {
                        kotlin.jvm.internal.p.i("currentTag");
                        throw null;
                    }
                }
                ArrayList i13 = w5.a.i(context);
                arrayList = new ArrayList();
                it = i13.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    k5.e eVar4 = (k5.e) next;
                    if (eVar4.f7343y == 0 && eVar4.B != null) {
                        arrayList.add(eVar4);
                    }
                }
                l5.G(context, a0Var);
                if (arrayList.isEmpty()) {
                    String str15 = pVar.f7469a;
                    str15.getClass();
                    sVar2.getClass();
                    g2 k12 = sVar2.k(str5 + "/eapi/v2/tracker/device/" + str15 + "/status", null, str4, false);
                    if (str11 != null) {
                        a0Var.x("getStatus", null, k12, c(str11));
                        if (!k12.b() && (str10 = k12.f7389a) != null && str10.length() != 0) {
                            String str16 = k12.f7389a;
                            str16.getClass();
                            JSONObject jSONObject = new JSONObject(str16);
                            if (jSONObject.optInt("success") == 1) {
                                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                                if (optJSONObject != null) {
                                    String str17 = str2;
                                    if (!optJSONObject.isNull(str17)) {
                                        str7 = optJSONObject.optString(str17);
                                        if (str7 != null) {
                                            str8 = w5.a.e(arrayList);
                                        } else {
                                            str8 = null;
                                        }
                                        if (str8 != null || !str8.equals(str7)) {
                                            String str18 = pVar.f7469a;
                                            str18.getClass();
                                            G = sVar2.G(str18, arrayList, z10);
                                            a0Var.x("saveTracking", null, G, c(str11));
                                            if (!sVar2.c(G) && G.f7389a != null) {
                                                String str19 = G.f7389a;
                                                str19.getClass();
                                            } else {
                                                if (G.f7390b == 404) {
                                                    s7.a.S(context, "device_status", null);
                                                    s7.a.M(context, "is_device_tracking_registered", false);
                                                    this.f4544c = true;
                                                    return zVar;
                                                }
                                                b(G);
                                                return zVar;
                                            }
                                        }
                                        try {
                                            sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                                            str9 = str;
                                        } catch (Exception unused) {
                                            str9 = str;
                                        }
                                        if (sharedPreferences.contains(str9)) {
                                            z11 = sharedPreferences.getBoolean(str9, false);
                                            if (!z11) {
                                                i iVar = new i(arrayList, context);
                                                sVar.f3341a = pVar;
                                                sVar.f3342b = null;
                                                sVar.l = i8;
                                                sVar.m = z11;
                                                sVar.p = 2;
                                                Object obj4 = new Object();
                                                e eVar5 = p0.f3588a;
                                                Object K2 = f0.K(j8.d.f7053a, new j(iVar, obj4, null, 7), sVar);
                                                if (K2 != aVar) {
                                                    K2 = zVar;
                                                }
                                                if (K2 != aVar) {
                                                    i10 = i8;
                                                    pVar2 = pVar;
                                                    pVar = pVar2;
                                                    i8 = i10;
                                                } else {
                                                    return aVar;
                                                }
                                            }
                                            if (str11 != null) {
                                            }
                                        }
                                        z11 = false;
                                        if (!z11) {
                                        }
                                        if (str11 != null) {
                                        }
                                    }
                                }
                                str7 = null;
                                if (str7 != null) {
                                }
                                if (str8 != null) {
                                }
                                String str182 = pVar.f7469a;
                                str182.getClass();
                                G = sVar2.G(str182, arrayList, z10);
                                a0Var.x("saveTracking", null, G, c(str11));
                                if (!sVar2.c(G)) {
                                }
                                if (G.f7390b == 404) {
                                }
                            }
                            return zVar;
                        }
                        if (k12.f7390b == 404) {
                            str7 = null;
                            if (str7 != null) {
                            }
                            if (str8 != null) {
                            }
                            String str1822 = pVar.f7469a;
                            str1822.getClass();
                            G = sVar2.G(str1822, arrayList, z10);
                            a0Var.x("saveTracking", null, G, c(str11));
                            if (!sVar2.c(G)) {
                            }
                            if (G.f7390b == 404) {
                            }
                        } else {
                            b(k12);
                            return zVar;
                        }
                    } else {
                        kotlin.jvm.internal.p.i("currentTag");
                        throw null;
                    }
                } else {
                    Bundle bundle = new Bundle();
                    String str20 = pVar.f7469a;
                    str20.getClass();
                    bundle.putString("identifier", str20);
                    bundle.putString("error", "noApps");
                    if (str11 != null) {
                        a0Var.x("error", bundle, null, c(str11));
                        return zVar;
                    }
                    kotlin.jvm.internal.p.i("currentTag");
                    throw null;
                }
            }
        }
        sVar = new s(this, cVar);
        Object obj5 = sVar.f3343n;
        i = sVar.p;
        a aVar22 = a.f6117a;
        boolean z122 = this.f4543b;
        String str112 = this.f4546e;
        a0 a0Var2 = this.f4547f;
        z zVar2 = z.f3538a;
        Context context2 = this.f4542a;
        if (i == 0) {
        }
        ArrayList i132 = w5.a.i(context2);
        arrayList = new ArrayList();
        it = i132.iterator();
        it.getClass();
        while (it.hasNext()) {
        }
        l5.G(context2, a0Var2);
        if (arrayList.isEmpty()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:44|(16:46|(5:48|49|50|(2:52|53)|55)(5:83|84|85|(2:87|88)|90)|60|61|62|(2:64|65)|68|69|70|(6:72|(2:75|(1:77))|15|(1:17)|18|19)|79|(2:75|(0))|15|(0)|18|19)|93|60|61|62|(0)|68|69|70|(0)|79|(0)|15|(0)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0109, code lost:
    
        if (r10.equalsIgnoreCase("reduced") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0135, code lost:
    
        if ((java.lang.System.currentTimeMillis() - s7.a.x(0, r7, "last_tracking_timestamp")) <= 86400000) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0138, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0153, code lost:
    
        if (java.lang.System.currentTimeMillis() < r10.getLong("maintenance_time", 0)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0124, code lost:
    
        if (r10.equalsIgnoreCase("reduced") != false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149 A[Catch: Exception -> 0x0156, TRY_LEAVE, TryCatch #2 {Exception -> 0x0156, blocks: (B:62:0x013d, B:64:0x0149), top: B:61:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0162 A[Catch: Exception -> 0x0167, TRY_LEAVE, TryCatch #1 {Exception -> 0x0167, blocks: (B:70:0x0158, B:72:0x0162), top: B:69:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(g7.c cVar) {
        q qVar;
        int i;
        boolean z10;
        boolean z11;
        Object d10;
        Object obj;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i3 = qVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qVar.l = i3 - Integer.MIN_VALUE;
                Object obj2 = qVar.f3337a;
                i = qVar.l;
                Context context = this.f4542a;
                if (i == 0) {
                    if (i == 1) {
                        c7.a.e(obj2);
                    } else {
                        d.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    c7.a.e(obj2);
                    if (getRunAttemptCount() > 1) {
                        ListenableWorker.Result success = ListenableWorker.Result.success();
                        success.getClass();
                        return success;
                    }
                    String str = this.f4546e;
                    if (str != null) {
                        if (str.equalsIgnoreCase("TrackingWorkerPeriodic")) {
                            float f7 = UptodownApp.G;
                            if (n4.e.n(context, "TrackingWorkerSingle") || n4.e.n(context, "GenerateQueueWorker") || n4.e.n(context, "DownloadUpdatesWorker")) {
                                ListenableWorker.Result success2 = ListenableWorker.Result.success();
                                success2.getClass();
                                return success2;
                            }
                        } else if (str.equalsIgnoreCase("TrackingWorkerSingle")) {
                            float f10 = UptodownApp.G;
                            if (n4.e.n(context, "TrackingWorkerPeriodic") || n4.e.n(context, "GenerateQueueWorker") || n4.e.n(context, "DownloadUpdatesWorker")) {
                                ListenableWorker.Result success3 = ListenableWorker.Result.success();
                                success3.getClass();
                                return success3;
                            }
                        }
                        context.getClass();
                        PackageManager packageManager = context.getPackageManager();
                        packageManager.getClass();
                        String packageName = context.getPackageName();
                        packageName.getClass();
                        if (!v.a0(w5.a.d(packageManager, packageName, "SHA256"), "822b9ca12b534ebcf426632221d951bfc60eb08f9f0cf2839c321b0685c2e8a4", true) || (context.getApplicationInfo().flags & 2) != 0 || Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
                            UptodownApp.f4376a0.send(TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE, null);
                            ListenableWorker.Result success4 = ListenableWorker.Result.success();
                            success4.getClass();
                            return success4;
                        }
                        Activity activity = c.o;
                        b.p(context, null);
                        if (str.equalsIgnoreCase("TrackingWorkerPeriodic")) {
                            String str2 = "auto";
                            if (a4.f3696e) {
                                try {
                                    SharedPreferences sharedPreferences3 = context.getSharedPreferences("SettingsPreferences", 0);
                                    if (sharedPreferences3.contains("background_sync_wifi")) {
                                        String string = sharedPreferences3.getString("background_sync_wifi", "auto");
                                        string.getClass();
                                        str2 = string;
                                    }
                                } catch (Exception unused) {
                                }
                            } else {
                                try {
                                    SharedPreferences sharedPreferences4 = context.getSharedPreferences("SettingsPreferences", 0);
                                    if (sharedPreferences4.contains("background_sync_mobile_data")) {
                                        String string2 = sharedPreferences4.getString("background_sync_mobile_data", "auto");
                                        string2.getClass();
                                        str2 = string2;
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                            sharedPreferences2 = context.getSharedPreferences("SharedPreferencesTracking", 0);
                            if (sharedPreferences2.contains("maintenance_time")) {
                            }
                            sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                            if (sharedPreferences.contains("gdpr_tracking_allowed")) {
                                z11 = sharedPreferences.getBoolean("gdpr_tracking_allowed", false);
                                if (z11 && z10) {
                                    qVar.l = 1;
                                    d10 = d(qVar);
                                    obj = a.f6117a;
                                    if (d10 == obj) {
                                        return obj;
                                    }
                                }
                                if (!this.f4545d) {
                                    UptodownApp.f4376a0.send(601, null);
                                }
                                ListenableWorker.Result success5 = ListenableWorker.Result.success();
                                success5.getClass();
                                return success5;
                            }
                            z11 = false;
                            if (z11) {
                                qVar.l = 1;
                                d10 = d(qVar);
                                obj = a.f6117a;
                                if (d10 == obj) {
                                }
                            }
                            if (!this.f4545d) {
                            }
                            ListenableWorker.Result success52 = ListenableWorker.Result.success();
                            success52.getClass();
                            return success52;
                        }
                        z10 = true;
                        sharedPreferences2 = context.getSharedPreferences("SharedPreferencesTracking", 0);
                        if (sharedPreferences2.contains("maintenance_time")) {
                        }
                        sharedPreferences = context.getSharedPreferences("SettingsPreferences", 0);
                        if (sharedPreferences.contains("gdpr_tracking_allowed")) {
                        }
                        z11 = false;
                        if (z11) {
                        }
                        if (!this.f4545d) {
                        }
                        ListenableWorker.Result success522 = ListenableWorker.Result.success();
                        success522.getClass();
                        return success522;
                    }
                    kotlin.jvm.internal.p.i("currentTag");
                    throw null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                context.getClass();
                SharedPreferences sharedPreferences5 = context.getSharedPreferences("SettingsPreferences", 0);
                sharedPreferences5.getClass();
                SharedPreferences.Editor edit = sharedPreferences5.edit();
                edit.putLong("last_tracking_timestamp", currentTimeMillis);
                edit.apply();
                if (this.f4544c) {
                    ListenableWorker.Result retry = ListenableWorker.Result.retry();
                    retry.getClass();
                    return retry;
                }
                if (!this.f4545d) {
                }
                ListenableWorker.Result success5222 = ListenableWorker.Result.success();
                success5222.getClass();
                return success5222;
            }
        }
        qVar = new q(this, cVar);
        Object obj22 = qVar.f3337a;
        i = qVar.l;
        Context context2 = this.f4542a;
        if (i == 0) {
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        context2.getClass();
        SharedPreferences sharedPreferences52 = context2.getSharedPreferences("SettingsPreferences", 0);
        sharedPreferences52.getClass();
        SharedPreferences.Editor edit2 = sharedPreferences52.edit();
        edit2.putLong("last_tracking_timestamp", currentTimeMillis2);
        edit2.apply();
        if (this.f4544c) {
        }
        if (!this.f4545d) {
        }
        ListenableWorker.Result success52222 = ListenableWorker.Result.success();
        success52222.getClass();
        return success52222;
    }
}
