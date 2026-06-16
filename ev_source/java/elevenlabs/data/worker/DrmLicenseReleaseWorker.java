package io.elevenlabs.data.worker;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.util.Base64;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.protobuf.c6;
import dc.e;
import dc.l;
import dc.s;
import dc.t;
import dc.w;
import dc.y;
import dc.z;
import ec.r;
import io.elevenlabs.di.WorkerEntryPoint;
import io.elevenlabs.domain.Logger;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import lc.o;
import livekit.LivekitInternal$NodeStats;
import tn.n;
import wn.c;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/data/worker/DrmLicenseReleaseWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ldc/t;", "doWork", "(Lwn/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Lio/elevenlabs/di/WorkerEntryPoint;", "entryPoint", "Lio/elevenlabs/di/WorkerEntryPoint;", "Lio/elevenlabs/data/worker/OfflineDrmLicenseHelper;", "drmHelper", "Lio/elevenlabs/data/worker/OfflineDrmLicenseHelper;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Logger;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class DrmLicenseReleaseWorker extends CoroutineWorker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String KEY_FILE_NUMBERS = "fileNumbers";
    private static final String KEY_KEY_SET_IDS = "keySetIds";
    private static final String KEY_READ_ID = "readId";
    private static final int MAX_CONSECUTIVE_FAILURES = 3;
    private static final String TAG = "DrmLicenseRelease";
    private final Context appContext;
    private final OfflineDrmLicenseHelper drmHelper;
    private final WorkerEntryPoint entryPoint;
    private final Logger logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrmLicenseReleaseWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.appContext = context;
        WorkerEntryPoint entryPoint = WorkerEntryPoint.INSTANCE.getEntryPoint(context);
        this.entryPoint = entryPoint;
        this.drmHelper = entryPoint.getOfflineDrmLicenseHelper();
        this.logger = entryPoint.getLogger();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00e0 -> B:10:0x00e3). Please report as a decompilation issue!!! */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(c<? super t> cVar) {
        DrmLicenseReleaseWorker$doWork$1 drmLicenseReleaseWorker$doWork$1;
        int i10;
        String str;
        String[] strArr;
        String[] strArr2;
        int length;
        int i11;
        int i12;
        int i13;
        if (cVar instanceof DrmLicenseReleaseWorker$doWork$1) {
            drmLicenseReleaseWorker$doWork$1 = (DrmLicenseReleaseWorker$doWork$1) cVar;
            int i14 = drmLicenseReleaseWorker$doWork$1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                drmLicenseReleaseWorker$doWork$1.label = i14 - Integer.MIN_VALUE;
                Object obj = drmLicenseReleaseWorker$doWork$1.result;
                i10 = drmLicenseReleaseWorker$doWork$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        length = drmLicenseReleaseWorker$doWork$1.I$3;
                        i11 = drmLicenseReleaseWorker$doWork$1.I$2;
                        i12 = drmLicenseReleaseWorker$doWork$1.I$1;
                        i13 = drmLicenseReleaseWorker$doWork$1.I$0;
                        strArr2 = (String[]) drmLicenseReleaseWorker$doWork$1.L$2;
                        strArr = (String[]) drmLicenseReleaseWorker$doWork$1.L$1;
                        str = (String) drmLicenseReleaseWorker$doWork$1.L$0;
                        sn.a.g(obj);
                        if (((Boolean) obj).booleanValue()) {
                            i13++;
                            i12 = 0;
                        } else {
                            i12++;
                            if (i12 >= 3) {
                                Logger logger = this.logger;
                                int length2 = strArr.length;
                                StringBuilder g10 = h.g("Aborting after ", i12, " consecutive failures (released ", i13, Separators.SLASH);
                                g10.append(length2);
                                g10.append(" for readId=");
                                g10.append(str);
                                g10.append(Separators.RPAREN);
                                logger.log(TAG, g10.toString());
                                if (i13 > 0) {
                                    Logger logger2 = this.logger;
                                    StringBuilder g11 = h.g("Released ", i13, Separators.SLASH, strArr.length, " DRM license(s) for readId=");
                                    g11.append(str);
                                    logger2.log(TAG, g11.toString());
                                }
                                return new s();
                            }
                        }
                        i11++;
                        if (i11 < length) {
                            String str2 = strArr[i11];
                            if (str2 == null) {
                                return new s();
                            }
                            String str3 = (String) n.M0(i11, strArr2);
                            if (str3 == null) {
                                return new s();
                            }
                            OfflineDrmLicenseHelper offlineDrmLicenseHelper = this.drmHelper;
                            byte[] decode = Base64.decode(str3, 2);
                            decode.getClass();
                            drmLicenseReleaseWorker$doWork$1.L$0 = str;
                            drmLicenseReleaseWorker$doWork$1.L$1 = strArr;
                            drmLicenseReleaseWorker$doWork$1.L$2 = strArr2;
                            drmLicenseReleaseWorker$doWork$1.L$3 = null;
                            drmLicenseReleaseWorker$doWork$1.L$4 = null;
                            drmLicenseReleaseWorker$doWork$1.I$0 = i13;
                            drmLicenseReleaseWorker$doWork$1.I$1 = i12;
                            drmLicenseReleaseWorker$doWork$1.I$2 = i11;
                            drmLicenseReleaseWorker$doWork$1.I$3 = length;
                            drmLicenseReleaseWorker$doWork$1.label = 1;
                            obj = offlineDrmLicenseHelper.releaseLicense(str, str2, decode, drmLicenseReleaseWorker$doWork$1);
                            xn.a aVar = xn.a.f37986a;
                            if (obj == aVar) {
                                return aVar;
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                            i11++;
                            if (i11 < length) {
                            }
                        }
                        if (i13 > 0) {
                        }
                        return new s();
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
                String a10 = getInputData().a(KEY_READ_ID);
                if (a10 == null) {
                    return new s();
                }
                String[] b10 = getInputData().b(KEY_FILE_NUMBERS);
                if (b10 == null) {
                    return new s();
                }
                String[] b11 = getInputData().b(KEY_KEY_SET_IDS);
                if (b11 == null) {
                    return new s();
                }
                this.logger.log(TAG, p.n.h(b10.length, "Releasing ", " DRM license(s) for readId=", a10));
                str = a10;
                strArr = b10;
                strArr2 = b11;
                length = b10.length;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                if (i11 < length) {
                }
                if (i13 > 0) {
                }
                return new s();
            }
        }
        drmLicenseReleaseWorker$doWork$1 = new DrmLicenseReleaseWorker$doWork$1(this, cVar);
        Object obj2 = drmLicenseReleaseWorker$doWork$1.result;
        i10 = drmLicenseReleaseWorker$doWork$1.label;
        if (i10 == 0) {
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/data/worker/DrmLicenseReleaseWorker$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", DrmLicenseReleaseWorker.KEY_READ_ID, "", DrmLicenseReleaseWorker.KEY_FILE_NUMBERS, DrmLicenseReleaseWorker.KEY_KEY_SET_IDS, "Lsn/z;", "schedule", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "TAG", "Ljava/lang/String;", "KEY_READ_ID", "KEY_FILE_NUMBERS", "KEY_KEY_SET_IDS", "", "MAX_CONSECUTIVE_FAILURES", TokenNames.I, "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final void schedule(Context context, String readId, List<String> fileNumbers, List<String> keySetIds) {
            context.getClass();
            readId.getClass();
            fileNumbers.getClass();
            keySetIds.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(DrmLicenseReleaseWorker.KEY_READ_ID, readId);
            String[] strArr = (String[]) fileNumbers.toArray(new String[0]);
            strArr.getClass();
            linkedHashMap.put(DrmLicenseReleaseWorker.KEY_FILE_NUMBERS, strArr);
            String[] strArr2 = (String[]) keySetIds.toArray(new String[0]);
            strArr2.getClass();
            linkedHashMap.put(DrmLicenseReleaseWorker.KEY_KEY_SET_IDS, strArr2);
            dc.h hVar = new dc.h(linkedHashMap);
            ec.t.J(hVar);
            y yVar = new y(DrmLicenseReleaseWorker.class, 0);
            ((o) yVar.f7881c).f21677e = hVar;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ((o) yVar.f7881c).f21682j = new e(new mc.e(null), w.f7917b, false, false, false, false, -1L, -1L, tn.o.l1(linkedHashSet));
            r.c(context).b("drmLicenseRelease-".concat(readId), l.f7899d, (z) yVar.a());
        }

        private Companion() {
        }
    }
}
