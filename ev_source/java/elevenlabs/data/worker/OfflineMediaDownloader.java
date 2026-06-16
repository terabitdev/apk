package io.elevenlabs.data.worker;

import ae.l;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.util.Base64;
import c8.g;
import c8.h;
import c8.p;
import c8.s;
import com.google.protobuf.c6;
import d8.e;
import d8.i;
import d8.o;
import d8.v;
import dc.t;
import defpackage.f;
import gh.w1;
import io.elevenlabs.data.database.entities.offline.OfflineChapterEntity;
import io.elevenlabs.data.database.entities.offline.OfflineReadEntity;
import io.elevenlabs.data.database.entities.offline.OfflineReadsDao;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.data.model.response.d;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Configuration;
import io.elevenlabs.domain.ConfigurationKt;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.MediaManifestService;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import livekit.LivekitInternal$NodeStats;
import p.n;
import sn.z;
import w7.g0;
import w7.h0;
import w7.j0;
import w7.k0;
import w7.l0;
import w7.m0;
import w7.n0;
import w7.r0;
import w7.u0;
import wn.c;
import z7.w;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002KJBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ6\u0010#\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b#\u0010$J0\u0010&\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010%\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b(\u0010)J\u001b\u0010.\u001a\u00020-2\n\u0010,\u001a\u00060*j\u0002`+H\u0002¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b0\u0010)JK\u00107\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00162\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00106\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u00020-2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b9\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010@R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010AR(\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001b0B8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bC\u0010E\"\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lio/elevenlabs/data/worker/OfflineMediaDownloader;", "Lio/elevenlabs/data/worker/OfflineDownloader;", "Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;", "offlineReadsDao", "Lio/elevenlabs/data/database/entities/reads/ReadsDao;", "readsDao", "Lio/elevenlabs/domain/services/MediaManifestService;", "mediaManifestService", "Ld8/v;", "simpleCache", "Lio/elevenlabs/domain/Configuration;", "configuration", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/data/worker/OfflineDrmLicenseHelper;", "offlineDrmLicenseHelper", "<init>", "(Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;Lio/elevenlabs/data/database/entities/reads/ReadsDao;Lio/elevenlabs/domain/services/MediaManifestService;Ld8/v;Lio/elevenlabs/domain/Configuration;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/data/worker/OfflineDrmLicenseHelper;)V", "", "offlineReadId", "", "readId", "", "chapterIndex", "fileNumber", "", "useDrm", "Lsn/z;", "downloadChapter", "(JLjava/lang/String;ILjava/lang/String;ZLwn/c;)Ljava/lang/Object;", "", "Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity;", "chapters", "downloadPendingChapters", "(JLjava/lang/String;Ljava/util/List;ZLwn/c;)Ljava/lang/Object;", "chapter", "processChapter", "(JLjava/lang/String;Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity;ZLwn/c;)Ljava/lang/Object;", "markStuckChaptersAsError", "(JLwn/c;)Ljava/lang/Object;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ldc/t;", "handleNetworkError", "(Ljava/lang/Exception;)Ldc/t;", "ensureNotStopped", "voiceId", "status", "errorType", "errorMessage", "", "durationSeconds", "logFinished", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "doWork", "Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;", "Lio/elevenlabs/data/database/entities/reads/ReadsDao;", "Lio/elevenlabs/domain/services/MediaManifestService;", "Ld8/v;", "Lio/elevenlabs/domain/Configuration;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/data/worker/OfflineDrmLicenseHelper;", "Lkotlin/Function0;", "isStoppedChecker", "Lho/a;", "()Lho/a;", "setStoppedChecker", "(Lho/a;)V", "isStopped", "()Z", "Companion", "StoppedException", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class OfflineMediaDownloader implements OfflineDownloader {
    private static final String TAG = "OfflineMediaDownloader";
    private final Analytics analytics;
    private final Configuration configuration;
    private ho.a isStoppedChecker;
    private final Logger logger;
    private final MediaManifestService mediaManifestService;
    private final OfflineDrmLicenseHelper offlineDrmLicenseHelper;
    private final OfflineReadsDao offlineReadsDao;
    private final ReadsDao readsDao;
    private final v simpleCache;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/elevenlabs/data/worker/OfflineMediaDownloader$StoppedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class StoppedException extends Exception {
    }

    public OfflineMediaDownloader(OfflineReadsDao offlineReadsDao, ReadsDao readsDao, MediaManifestService mediaManifestService, v vVar, Configuration configuration, Logger logger, Analytics analytics, OfflineDrmLicenseHelper offlineDrmLicenseHelper) {
        offlineReadsDao.getClass();
        readsDao.getClass();
        mediaManifestService.getClass();
        vVar.getClass();
        configuration.getClass();
        logger.getClass();
        analytics.getClass();
        offlineDrmLicenseHelper.getClass();
        this.offlineReadsDao = offlineReadsDao;
        this.readsDao = readsDao;
        this.mediaManifestService = mediaManifestService;
        this.simpleCache = vVar;
        this.configuration = configuration;
        this.logger = logger;
        this.analytics = analytics;
        this.offlineDrmLicenseHelper = offlineDrmLicenseHelper;
        this.isStoppedChecker = new d(23);
    }

    private static final double doWork$elapsed(long j4) {
        return (System.currentTimeMillis() - j4) / 1000.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x01a2, code lost:
    
        if (r0 == r4) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x017a, code lost:
    
        if (r0 == r4) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0157, code lost:
    
        if (r0.recomputeReadAggregate(r9, r11) != r4) goto L192;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0029. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r9v14, types: [w7.h0, w7.i0] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadChapter(long j4, String str, int i10, String str2, boolean z6, c<? super z> cVar) {
        OfflineMediaDownloader$downloadChapter$1 offlineMediaDownloader$downloadChapter$1;
        OfflineMediaDownloader$downloadChapter$1 offlineMediaDownloader$downloadChapter$12;
        String str3;
        long j10;
        int i11;
        boolean z10;
        long j11;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z11;
        m0 m0Var;
        OfflineMediaDownloader offlineMediaDownloader;
        h hVar;
        boolean z12;
        long j12;
        int i12;
        xn.a aVar;
        long j13;
        String str8;
        h hVar2;
        e a10;
        byte[] bArr;
        i iVar;
        j0 j0Var;
        OfflineReadsDao offlineReadsDao;
        String encodeToString;
        OfflineReadsDao offlineReadsDao2;
        OfflineChapterEntity.Status status;
        long currentTimeMillis;
        long j14;
        String str9 = Separators.SLASH;
        String str10 = TAG;
        if (cVar instanceof OfflineMediaDownloader$downloadChapter$1) {
            offlineMediaDownloader$downloadChapter$1 = (OfflineMediaDownloader$downloadChapter$1) cVar;
            int i13 = offlineMediaDownloader$downloadChapter$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                offlineMediaDownloader$downloadChapter$1.label = i13 - Integer.MIN_VALUE;
                offlineMediaDownloader$downloadChapter$12 = offlineMediaDownloader$downloadChapter$1;
                Object obj = offlineMediaDownloader$downloadChapter$12.result;
                xn.a aVar2 = xn.a.f37986a;
                switch (offlineMediaDownloader$downloadChapter$12.label) {
                    case 0:
                        sn.a.g(obj);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        OfflineReadsDao offlineReadsDao3 = this.offlineReadsDao;
                        OfflineChapterEntity.Status status2 = OfflineChapterEntity.Status.DOWNLOADING;
                        offlineMediaDownloader$downloadChapter$12.L$0 = str;
                        str3 = str2;
                        offlineMediaDownloader$downloadChapter$12.L$1 = str3;
                        offlineMediaDownloader$downloadChapter$12.J$0 = j4;
                        offlineMediaDownloader$downloadChapter$12.I$0 = i10;
                        offlineMediaDownloader$downloadChapter$12.Z$0 = z6;
                        offlineMediaDownloader$downloadChapter$12.J$1 = currentTimeMillis2;
                        offlineMediaDownloader$downloadChapter$12.label = 1;
                        if (offlineReadsDao3.updateChapterStatus(j4, i10, status2, 0, offlineMediaDownloader$downloadChapter$12) != aVar2) {
                            j10 = j4;
                            i11 = i10;
                            z10 = z6;
                            j11 = currentTimeMillis2;
                            str4 = str;
                            OfflineReadsDao offlineReadsDao4 = this.offlineReadsDao;
                            offlineMediaDownloader$downloadChapter$12.L$0 = str4;
                            offlineMediaDownloader$downloadChapter$12.L$1 = str3;
                            offlineMediaDownloader$downloadChapter$12.J$0 = j10;
                            offlineMediaDownloader$downloadChapter$12.I$0 = i11;
                            offlineMediaDownloader$downloadChapter$12.Z$0 = z10;
                            offlineMediaDownloader$downloadChapter$12.J$1 = j11;
                            offlineMediaDownloader$downloadChapter$12.label = 2;
                            break;
                        }
                        return aVar2;
                    case 1:
                        j11 = offlineMediaDownloader$downloadChapter$12.J$1;
                        z10 = offlineMediaDownloader$downloadChapter$12.Z$0;
                        i11 = offlineMediaDownloader$downloadChapter$12.I$0;
                        j10 = offlineMediaDownloader$downloadChapter$12.J$0;
                        str3 = (String) offlineMediaDownloader$downloadChapter$12.L$1;
                        str4 = (String) offlineMediaDownloader$downloadChapter$12.L$0;
                        sn.a.g(obj);
                        OfflineReadsDao offlineReadsDao42 = this.offlineReadsDao;
                        offlineMediaDownloader$downloadChapter$12.L$0 = str4;
                        offlineMediaDownloader$downloadChapter$12.L$1 = str3;
                        offlineMediaDownloader$downloadChapter$12.J$0 = j10;
                        offlineMediaDownloader$downloadChapter$12.I$0 = i11;
                        offlineMediaDownloader$downloadChapter$12.Z$0 = z10;
                        offlineMediaDownloader$downloadChapter$12.J$1 = j11;
                        offlineMediaDownloader$downloadChapter$12.label = 2;
                        break;
                    case 2:
                        j11 = offlineMediaDownloader$downloadChapter$12.J$1;
                        z10 = offlineMediaDownloader$downloadChapter$12.Z$0;
                        i11 = offlineMediaDownloader$downloadChapter$12.I$0;
                        j10 = offlineMediaDownloader$downloadChapter$12.J$0;
                        str3 = (String) offlineMediaDownloader$downloadChapter$12.L$1;
                        str4 = (String) offlineMediaDownloader$downloadChapter$12.L$0;
                        sn.a.g(obj);
                        this.logger.log(TAG, f.k("Resolving manifest URL for ", str4, Separators.SLASH, str3));
                        MediaManifestService mediaManifestService = this.mediaManifestService;
                        offlineMediaDownloader$downloadChapter$12.L$0 = str4;
                        offlineMediaDownloader$downloadChapter$12.L$1 = str3;
                        offlineMediaDownloader$downloadChapter$12.J$0 = j10;
                        offlineMediaDownloader$downloadChapter$12.I$0 = i11;
                        offlineMediaDownloader$downloadChapter$12.Z$0 = z10;
                        offlineMediaDownloader$downloadChapter$12.J$1 = j11;
                        offlineMediaDownloader$downloadChapter$12.label = 3;
                        obj = mediaManifestService.getHlsManifestUrl(str4, str3, offlineMediaDownloader$downloadChapter$12);
                        break;
                    case 3:
                        j11 = offlineMediaDownloader$downloadChapter$12.J$1;
                        z10 = offlineMediaDownloader$downloadChapter$12.Z$0;
                        i11 = offlineMediaDownloader$downloadChapter$12.I$0;
                        j10 = offlineMediaDownloader$downloadChapter$12.J$0;
                        str3 = (String) offlineMediaDownloader$downloadChapter$12.L$1;
                        str4 = (String) offlineMediaDownloader$downloadChapter$12.L$0;
                        sn.a.g(obj);
                        String str11 = str4;
                        str5 = str3;
                        str6 = str11;
                        String str12 = (String) obj;
                        OfflineReadsDao offlineReadsDao5 = this.offlineReadsDao;
                        offlineMediaDownloader$downloadChapter$12.L$0 = str6;
                        offlineMediaDownloader$downloadChapter$12.L$1 = str5;
                        offlineMediaDownloader$downloadChapter$12.L$2 = str12;
                        offlineMediaDownloader$downloadChapter$12.J$0 = j10;
                        offlineMediaDownloader$downloadChapter$12.I$0 = i11;
                        offlineMediaDownloader$downloadChapter$12.Z$0 = z10;
                        offlineMediaDownloader$downloadChapter$12.J$1 = j11;
                        offlineMediaDownloader$downloadChapter$12.label = 4;
                        Object updateChapterManifestUrl = offlineReadsDao5.updateChapterManifestUrl(j10, i11, str12, offlineMediaDownloader$downloadChapter$12);
                        str7 = str12;
                        break;
                    case 4:
                        j11 = offlineMediaDownloader$downloadChapter$12.J$1;
                        z10 = offlineMediaDownloader$downloadChapter$12.Z$0;
                        i11 = offlineMediaDownloader$downloadChapter$12.I$0;
                        j10 = offlineMediaDownloader$downloadChapter$12.J$0;
                        str7 = (String) offlineMediaDownloader$downloadChapter$12.L$2;
                        str5 = (String) offlineMediaDownloader$downloadChapter$12.L$1;
                        str6 = (String) offlineMediaDownloader$downloadChapter$12.L$0;
                        sn.a.g(obj);
                        long j15 = j10;
                        this.logger.log(TAG, "Downloading chapter " + i11 + " (file=" + str5 + Separators.RPAREN);
                        g0 g0Var = new g0();
                        lb.a aVar3 = new lb.a();
                        List list = Collections.EMPTY_LIST;
                        w1 w1Var = w1.f11531e;
                        k0 k0Var = new k0();
                        n0 n0Var = n0.f36483d;
                        Uri parse = Uri.parse(str7);
                        if (((Uri) aVar3.f21640e) != null && ((UUID) aVar3.f21639d) == null) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        gg.b.y(z11);
                        if (parse != null) {
                            if (((UUID) aVar3.f21639d) != null) {
                                j0Var = new j0(aVar3);
                            } else {
                                j0Var = null;
                            }
                            m0Var = new m0(parse, null, j0Var, null, list, null, w1Var, -9223372036854775807L);
                        } else {
                            m0Var = null;
                        }
                        r0 r0Var = new r0("", new h0(g0Var), m0Var, new l0(k0Var), u0.L, n0Var);
                        d8.d dVar = new d8.d();
                        dVar.f7504a = this.simpleCache;
                        s sVar = new s(0);
                        sVar.f4909e = ConfigurationKt.getHttpUserAgent(this.configuration);
                        sVar.f4905a = 15000;
                        sVar.f4906b = 30000;
                        sVar.f4907c = true;
                        dVar.f7508e = sVar;
                        ?? obj2 = new Object();
                        obj2.f20557a = -1;
                        l8.a aVar4 = new l8.a(dVar);
                        l8.b bVar = new l8.b(r0Var, aVar4.f21422b, aVar4.f21421a, aVar4.f21423c, aVar4.f21424d, aVar4.f21425e);
                        int i14 = i11;
                        a aVar5 = new a((b0) obj2, this, j15, i14);
                        offlineMediaDownloader = this;
                        i iVar2 = bVar.f21432g;
                        ArrayList arrayList = bVar.f21429d;
                        d8.d dVar2 = bVar.f21430e;
                        long j16 = j11;
                        ArrayList arrayList2 = bVar.f21435j;
                        ArrayDeque arrayDeque = new ArrayDeque();
                        boolean z13 = z10;
                        ArrayDeque arrayDeque2 = new ArrayDeque();
                        try {
                            g gVar = dVar2.f7508e;
                            if (gVar != null) {
                                hVar = gVar.createDataSource();
                            } else {
                                hVar = null;
                            }
                            e a11 = dVar2.a(hVar, dVar2.f7509f | 1);
                            m8.s c5 = bVar.c(a11, bVar.f21427b, false);
                            if (!arrayList.isEmpty()) {
                                c5 = (m8.s) c5.a(arrayList);
                            }
                            ArrayList d10 = bVar.d(a11, c5, false);
                            Collections.sort(d10);
                            l8.b.e(d10, iVar2, bVar.f21434i);
                            int size = d10.size();
                            int size2 = d10.size() - 1;
                            long j17 = 0;
                            long j18 = 0;
                            int i15 = 0;
                            while (size2 >= 0) {
                                p pVar = ((q8.c) d10.get(size2)).f28136b;
                                String a12 = iVar2.a(pVar);
                                String str13 = str9;
                                String str14 = str10;
                                long j19 = pVar.f4893g;
                                if (j19 == -1) {
                                    iVar = iVar2;
                                    long a13 = o.a(bVar.f21431f.h(a12));
                                    if (a13 != -1) {
                                        j19 = a13 - pVar.f4892f;
                                    }
                                } else {
                                    iVar = iVar2;
                                }
                                long j20 = j19;
                                long f10 = bVar.f21431f.f(pVar.f4892f, j20, a12);
                                j18 += f10;
                                if (j20 != -1) {
                                    if (j20 == f10) {
                                        i15++;
                                        d10.remove(size2);
                                    }
                                    if (j17 != -1) {
                                        j17 += j20;
                                    }
                                } else {
                                    j17 = -1;
                                }
                                size2--;
                                iVar2 = iVar;
                                str10 = str14;
                                str9 = str13;
                            }
                            String str15 = str9;
                            String str16 = str10;
                            q8.b bVar2 = new q8.b(aVar5, j17, size, j18, i15);
                            arrayDeque.addAll(d10);
                            while (!arrayDeque.isEmpty()) {
                                if (!arrayDeque2.isEmpty()) {
                                    q8.d dVar3 = (q8.d) arrayDeque2.removeFirst();
                                    a10 = dVar3.Z;
                                    bArr = dVar3.f28138y0;
                                } else {
                                    g gVar2 = dVar2.f7508e;
                                    if (gVar2 != null) {
                                        hVar2 = gVar2.createDataSource();
                                    } else {
                                        hVar2 = null;
                                    }
                                    a10 = dVar2.a(hVar2, dVar2.f7509f | 1);
                                    bArr = new byte[131072];
                                }
                                q8.d dVar4 = new q8.d((q8.c) arrayDeque.removeFirst(), a10, bVar2, bArr);
                                synchronized (bVar.f21435j) {
                                    bVar.f21435j.add(dVar4);
                                }
                                bVar.f21433h.execute(dVar4);
                                for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                                    q8.d dVar5 = (q8.d) arrayList2.get(size3);
                                    if (arrayDeque.isEmpty() || dVar5.f39288b.e()) {
                                        try {
                                            dVar5.get();
                                            bVar.g(size3);
                                            arrayDeque2.addLast(dVar5);
                                        } catch (ExecutionException e10) {
                                            Throwable cause = e10.getCause();
                                            cause.getClass();
                                            if (cause instanceof IOException) {
                                                throw ((IOException) cause);
                                            }
                                            throw cause;
                                        }
                                    }
                                }
                                dVar4.f39287a.b();
                            }
                            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                ((w) arrayList2.get(i16)).cancel(true);
                            }
                            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                                ((w) arrayList2.get(size4)).f39288b.b();
                                bVar.g(size4);
                            }
                            if (z13) {
                                str8 = str16;
                                offlineMediaDownloader.logger.log(str8, f.k("Acquiring persistent DRM license for ", str6, str15, str5));
                                OfflineDrmLicenseHelper offlineDrmLicenseHelper = offlineMediaDownloader.offlineDrmLicenseHelper;
                                offlineMediaDownloader$downloadChapter$12 = offlineMediaDownloader$downloadChapter$12;
                                offlineMediaDownloader$downloadChapter$12.L$0 = null;
                                offlineMediaDownloader$downloadChapter$12.L$1 = null;
                                offlineMediaDownloader$downloadChapter$12.L$2 = null;
                                offlineMediaDownloader$downloadChapter$12.L$3 = null;
                                offlineMediaDownloader$downloadChapter$12.L$4 = null;
                                offlineMediaDownloader$downloadChapter$12.L$5 = null;
                                j12 = j15;
                                offlineMediaDownloader$downloadChapter$12.J$0 = j12;
                                i12 = i14;
                                offlineMediaDownloader$downloadChapter$12.I$0 = i12;
                                z12 = z13;
                                offlineMediaDownloader$downloadChapter$12.Z$0 = z12;
                                j13 = j16;
                                offlineMediaDownloader$downloadChapter$12.J$1 = j13;
                                offlineMediaDownloader$downloadChapter$12.label = 5;
                                obj = offlineDrmLicenseHelper.downloadLicense(str6, str5, offlineMediaDownloader$downloadChapter$12);
                                aVar = aVar2;
                                if (obj == aVar) {
                                    return aVar;
                                }
                                offlineReadsDao = offlineMediaDownloader.offlineReadsDao;
                                encodeToString = Base64.encodeToString((byte[]) obj, 2);
                                encodeToString.getClass();
                                offlineMediaDownloader$downloadChapter$12.L$0 = null;
                                offlineMediaDownloader$downloadChapter$12.L$1 = null;
                                offlineMediaDownloader$downloadChapter$12.L$2 = null;
                                offlineMediaDownloader$downloadChapter$12.L$3 = null;
                                offlineMediaDownloader$downloadChapter$12.L$4 = null;
                                offlineMediaDownloader$downloadChapter$12.L$5 = null;
                                offlineMediaDownloader$downloadChapter$12.L$6 = null;
                                offlineMediaDownloader$downloadChapter$12.J$0 = j12;
                                offlineMediaDownloader$downloadChapter$12.I$0 = i12;
                                offlineMediaDownloader$downloadChapter$12.Z$0 = z12;
                                offlineMediaDownloader$downloadChapter$12.J$1 = j13;
                                offlineMediaDownloader$downloadChapter$12.label = 6;
                                if (offlineReadsDao.updateChapterDrmKeySetId(j12, i12, encodeToString, offlineMediaDownloader$downloadChapter$12) == aVar) {
                                    return aVar;
                                }
                                long j21 = j13;
                                offlineReadsDao2 = offlineMediaDownloader.offlineReadsDao;
                                status = OfflineChapterEntity.Status.READY;
                                currentTimeMillis = System.currentTimeMillis() + OfflineChapterEntity.EXPIRY_MILLIS;
                                offlineMediaDownloader$downloadChapter$12.L$0 = null;
                                offlineMediaDownloader$downloadChapter$12.L$1 = null;
                                offlineMediaDownloader$downloadChapter$12.L$2 = null;
                                offlineMediaDownloader$downloadChapter$12.L$3 = null;
                                offlineMediaDownloader$downloadChapter$12.L$4 = null;
                                offlineMediaDownloader$downloadChapter$12.L$5 = null;
                                offlineMediaDownloader$downloadChapter$12.L$6 = null;
                                offlineMediaDownloader$downloadChapter$12.J$0 = j12;
                                offlineMediaDownloader$downloadChapter$12.I$0 = i12;
                                offlineMediaDownloader$downloadChapter$12.Z$0 = z12;
                                offlineMediaDownloader$downloadChapter$12.J$1 = j21;
                                offlineMediaDownloader$downloadChapter$12.label = 7;
                                if (offlineReadsDao2.updateChapterStatusAndExpiry(j12, i12, status, 100, currentTimeMillis, offlineMediaDownloader$downloadChapter$12) != aVar) {
                                    return aVar;
                                }
                                j14 = j21;
                                Logger logger = offlineMediaDownloader.logger;
                                logger.log(str8, "Finished downloading chapter " + i12 + " in " + ((System.currentTimeMillis() - j14) / 1000.0d) + "s");
                                return z.f31622a;
                            }
                            z12 = z13;
                            j12 = j15;
                            i12 = i14;
                            offlineMediaDownloader$downloadChapter$12 = offlineMediaDownloader$downloadChapter$12;
                            aVar = aVar2;
                            j13 = j16;
                            str8 = str16;
                            long j212 = j13;
                            offlineReadsDao2 = offlineMediaDownloader.offlineReadsDao;
                            status = OfflineChapterEntity.Status.READY;
                            currentTimeMillis = System.currentTimeMillis() + OfflineChapterEntity.EXPIRY_MILLIS;
                            offlineMediaDownloader$downloadChapter$12.L$0 = null;
                            offlineMediaDownloader$downloadChapter$12.L$1 = null;
                            offlineMediaDownloader$downloadChapter$12.L$2 = null;
                            offlineMediaDownloader$downloadChapter$12.L$3 = null;
                            offlineMediaDownloader$downloadChapter$12.L$4 = null;
                            offlineMediaDownloader$downloadChapter$12.L$5 = null;
                            offlineMediaDownloader$downloadChapter$12.L$6 = null;
                            offlineMediaDownloader$downloadChapter$12.J$0 = j12;
                            offlineMediaDownloader$downloadChapter$12.I$0 = i12;
                            offlineMediaDownloader$downloadChapter$12.Z$0 = z12;
                            offlineMediaDownloader$downloadChapter$12.J$1 = j212;
                            offlineMediaDownloader$downloadChapter$12.label = 7;
                            if (offlineReadsDao2.updateChapterStatusAndExpiry(j12, i12, status, 100, currentTimeMillis, offlineMediaDownloader$downloadChapter$12) != aVar) {
                            }
                        } catch (Throwable th) {
                            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                                ((w) arrayList2.get(i17)).cancel(true);
                            }
                            for (int size5 = arrayList2.size() - 1; size5 >= 0; size5--) {
                                ((w) arrayList2.get(size5)).f39288b.b();
                                bVar.g(size5);
                            }
                            throw th;
                        }
                        break;
                    case 5:
                        j13 = offlineMediaDownloader$downloadChapter$12.J$1;
                        boolean z14 = offlineMediaDownloader$downloadChapter$12.Z$0;
                        int i18 = offlineMediaDownloader$downloadChapter$12.I$0;
                        long j22 = offlineMediaDownloader$downloadChapter$12.J$0;
                        sn.a.g(obj);
                        offlineMediaDownloader = this;
                        aVar = aVar2;
                        j12 = j22;
                        i12 = i18;
                        z12 = z14;
                        str8 = TAG;
                        offlineReadsDao = offlineMediaDownloader.offlineReadsDao;
                        encodeToString = Base64.encodeToString((byte[]) obj, 2);
                        encodeToString.getClass();
                        offlineMediaDownloader$downloadChapter$12.L$0 = null;
                        offlineMediaDownloader$downloadChapter$12.L$1 = null;
                        offlineMediaDownloader$downloadChapter$12.L$2 = null;
                        offlineMediaDownloader$downloadChapter$12.L$3 = null;
                        offlineMediaDownloader$downloadChapter$12.L$4 = null;
                        offlineMediaDownloader$downloadChapter$12.L$5 = null;
                        offlineMediaDownloader$downloadChapter$12.L$6 = null;
                        offlineMediaDownloader$downloadChapter$12.J$0 = j12;
                        offlineMediaDownloader$downloadChapter$12.I$0 = i12;
                        offlineMediaDownloader$downloadChapter$12.Z$0 = z12;
                        offlineMediaDownloader$downloadChapter$12.J$1 = j13;
                        offlineMediaDownloader$downloadChapter$12.label = 6;
                        if (offlineReadsDao.updateChapterDrmKeySetId(j12, i12, encodeToString, offlineMediaDownloader$downloadChapter$12) == aVar) {
                        }
                        long j2122 = j13;
                        offlineReadsDao2 = offlineMediaDownloader.offlineReadsDao;
                        status = OfflineChapterEntity.Status.READY;
                        currentTimeMillis = System.currentTimeMillis() + OfflineChapterEntity.EXPIRY_MILLIS;
                        offlineMediaDownloader$downloadChapter$12.L$0 = null;
                        offlineMediaDownloader$downloadChapter$12.L$1 = null;
                        offlineMediaDownloader$downloadChapter$12.L$2 = null;
                        offlineMediaDownloader$downloadChapter$12.L$3 = null;
                        offlineMediaDownloader$downloadChapter$12.L$4 = null;
                        offlineMediaDownloader$downloadChapter$12.L$5 = null;
                        offlineMediaDownloader$downloadChapter$12.L$6 = null;
                        offlineMediaDownloader$downloadChapter$12.J$0 = j12;
                        offlineMediaDownloader$downloadChapter$12.I$0 = i12;
                        offlineMediaDownloader$downloadChapter$12.Z$0 = z12;
                        offlineMediaDownloader$downloadChapter$12.J$1 = j2122;
                        offlineMediaDownloader$downloadChapter$12.label = 7;
                        if (offlineReadsDao2.updateChapterStatusAndExpiry(j12, i12, status, 100, currentTimeMillis, offlineMediaDownloader$downloadChapter$12) != aVar) {
                        }
                        break;
                    case 6:
                        j13 = offlineMediaDownloader$downloadChapter$12.J$1;
                        boolean z15 = offlineMediaDownloader$downloadChapter$12.Z$0;
                        int i19 = offlineMediaDownloader$downloadChapter$12.I$0;
                        long j23 = offlineMediaDownloader$downloadChapter$12.J$0;
                        sn.a.g(obj);
                        offlineMediaDownloader = this;
                        aVar = aVar2;
                        j12 = j23;
                        i12 = i19;
                        z12 = z15;
                        str8 = TAG;
                        long j21222 = j13;
                        offlineReadsDao2 = offlineMediaDownloader.offlineReadsDao;
                        status = OfflineChapterEntity.Status.READY;
                        currentTimeMillis = System.currentTimeMillis() + OfflineChapterEntity.EXPIRY_MILLIS;
                        offlineMediaDownloader$downloadChapter$12.L$0 = null;
                        offlineMediaDownloader$downloadChapter$12.L$1 = null;
                        offlineMediaDownloader$downloadChapter$12.L$2 = null;
                        offlineMediaDownloader$downloadChapter$12.L$3 = null;
                        offlineMediaDownloader$downloadChapter$12.L$4 = null;
                        offlineMediaDownloader$downloadChapter$12.L$5 = null;
                        offlineMediaDownloader$downloadChapter$12.L$6 = null;
                        offlineMediaDownloader$downloadChapter$12.J$0 = j12;
                        offlineMediaDownloader$downloadChapter$12.I$0 = i12;
                        offlineMediaDownloader$downloadChapter$12.Z$0 = z12;
                        offlineMediaDownloader$downloadChapter$12.J$1 = j21222;
                        offlineMediaDownloader$downloadChapter$12.label = 7;
                        if (offlineReadsDao2.updateChapterStatusAndExpiry(j12, i12, status, 100, currentTimeMillis, offlineMediaDownloader$downloadChapter$12) != aVar) {
                        }
                        break;
                    case 7:
                        j14 = offlineMediaDownloader$downloadChapter$12.J$1;
                        int i20 = offlineMediaDownloader$downloadChapter$12.I$0;
                        sn.a.g(obj);
                        offlineMediaDownloader = this;
                        i12 = i20;
                        str8 = TAG;
                        Logger logger2 = offlineMediaDownloader.logger;
                        logger2.log(str8, "Finished downloading chapter " + i12 + " in " + ((System.currentTimeMillis() - j14) / 1000.0d) + "s");
                        return z.f31622a;
                    default:
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        offlineMediaDownloader$downloadChapter$1 = new OfflineMediaDownloader$downloadChapter$1(this, cVar);
        offlineMediaDownloader$downloadChapter$12 = offlineMediaDownloader$downloadChapter$1;
        Object obj3 = offlineMediaDownloader$downloadChapter$12.result;
        xn.a aVar22 = xn.a.f37986a;
        switch (offlineMediaDownloader$downloadChapter$12.label) {
        }
    }

    public static final void downloadChapter$lambda$0(b0 b0Var, OfflineMediaDownloader offlineMediaDownloader, long j4, int i10, long j10, long j11, float f10) {
        int m10 = l.m((int) f10, 0, 99);
        if (m10 != b0Var.f20557a) {
            b0Var.f20557a = m10;
            fr.g0.I(wn.i.f37087a, new OfflineMediaDownloader$downloadChapter$2$1(offlineMediaDownloader, j4, i10, m10, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x015f, code lost:
    
        r4 = r19.offlineReadsDao;
        r6.L$0 = r3;
        r6.L$1 = null;
        r6.L$2 = null;
        r6.L$3 = null;
        r6.L$4 = null;
        r6.J$0 = r1;
        r6.Z$0 = r5;
        r6.label = 4;
        r4 = r4.getChaptersToDownload(r1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0175, code lost:
    
        if (r4 != r12) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0178, code lost:
    
        r16 = r6;
        r6 = r3;
        r3 = r5;
        r17 = r1;
        r1 = r4;
        r4 = r17;
        r2 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015f A[EDGE_INSN: B:36:0x015f->B:37:0x015f BREAK  A[LOOP:1: B:28:0x013c->B:35:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0178 -> B:13:0x0183). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object downloadPendingChapters(long j4, String str, List<OfflineChapterEntity> list, boolean z6, c<? super z> cVar) {
        OfflineMediaDownloader$downloadPendingChapters$1 offlineMediaDownloader$downloadPendingChapters$1;
        int i10;
        String str2;
        boolean z10;
        Iterator<OfflineChapterEntity> it;
        OfflineMediaDownloader$downloadPendingChapters$1 offlineMediaDownloader$downloadPendingChapters$12;
        long j10;
        String str3;
        boolean z11;
        long j11;
        ArrayList arrayList;
        Iterator it2;
        OfflineMediaDownloader$downloadPendingChapters$1 offlineMediaDownloader$downloadPendingChapters$13;
        boolean z12;
        String str4;
        long j12;
        if (cVar instanceof OfflineMediaDownloader$downloadPendingChapters$1) {
            offlineMediaDownloader$downloadPendingChapters$1 = (OfflineMediaDownloader$downloadPendingChapters$1) cVar;
            int i11 = offlineMediaDownloader$downloadPendingChapters$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                offlineMediaDownloader$downloadPendingChapters$1.label = i11 - Integer.MIN_VALUE;
                Object obj = offlineMediaDownloader$downloadPendingChapters$1.result;
                i10 = offlineMediaDownloader$downloadPendingChapters$1.label;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    z11 = offlineMediaDownloader$downloadPendingChapters$1.Z$0;
                                    j11 = offlineMediaDownloader$downloadPendingChapters$1.J$0;
                                    str3 = (String) offlineMediaDownloader$downloadPendingChapters$1.L$0;
                                    sn.a.g(obj);
                                    arrayList = new ArrayList();
                                    for (Object obj3 : (Iterable) obj) {
                                        if (((OfflineChapterEntity) obj3).getStatus() == OfflineChapterEntity.Status.PENDING) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        ib.i.q("Found ", arrayList.size(), " chapter(s) added while downloading", this.logger, TAG);
                                        it2 = arrayList.iterator();
                                        String str5 = str3;
                                        offlineMediaDownloader$downloadPendingChapters$13 = offlineMediaDownloader$downloadPendingChapters$1;
                                        j12 = j11;
                                        z12 = z11;
                                        str4 = str5;
                                        while (true) {
                                            if (it2.hasNext()) {
                                                break;
                                            }
                                            OfflineChapterEntity offlineChapterEntity = (OfflineChapterEntity) it2.next();
                                            offlineMediaDownloader$downloadPendingChapters$13.L$0 = str4;
                                            offlineMediaDownloader$downloadPendingChapters$13.L$1 = null;
                                            offlineMediaDownloader$downloadPendingChapters$13.L$2 = null;
                                            offlineMediaDownloader$downloadPendingChapters$13.L$3 = it2;
                                            offlineMediaDownloader$downloadPendingChapters$13.L$4 = null;
                                            offlineMediaDownloader$downloadPendingChapters$13.J$0 = j12;
                                            offlineMediaDownloader$downloadPendingChapters$13.Z$0 = z12;
                                            offlineMediaDownloader$downloadPendingChapters$13.label = 3;
                                            if (processChapter(j12, str4, offlineChapterEntity, z12, offlineMediaDownloader$downloadPendingChapters$13) == obj2) {
                                                break;
                                            }
                                        }
                                        return obj2;
                                    }
                                    return z.f31622a;
                                }
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            boolean z13 = offlineMediaDownloader$downloadPendingChapters$1.Z$0;
                            long j13 = offlineMediaDownloader$downloadPendingChapters$1.J$0;
                            Iterator it3 = (Iterator) offlineMediaDownloader$downloadPendingChapters$1.L$3;
                            String str6 = (String) offlineMediaDownloader$downloadPendingChapters$1.L$0;
                            sn.a.g(obj);
                            offlineMediaDownloader$downloadPendingChapters$13 = offlineMediaDownloader$downloadPendingChapters$1;
                            j12 = j13;
                            z12 = z13;
                            str4 = str6;
                            it2 = it3;
                            while (true) {
                                if (it2.hasNext()) {
                                }
                            }
                            return obj2;
                        }
                        z11 = offlineMediaDownloader$downloadPendingChapters$1.Z$0;
                        j11 = offlineMediaDownloader$downloadPendingChapters$1.J$0;
                        str3 = (String) offlineMediaDownloader$downloadPendingChapters$1.L$0;
                        sn.a.g(obj);
                        arrayList = new ArrayList();
                        for (Object obj4 : (Iterable) obj) {
                            if (((OfflineChapterEntity) obj4).getStatus() == OfflineChapterEntity.Status.PENDING) {
                                arrayList.add(obj4);
                            }
                        }
                        if (arrayList.isEmpty()) {
                        }
                    } else {
                        boolean z14 = offlineMediaDownloader$downloadPendingChapters$1.Z$0;
                        long j14 = offlineMediaDownloader$downloadPendingChapters$1.J$0;
                        Iterator<OfflineChapterEntity> it4 = (Iterator) offlineMediaDownloader$downloadPendingChapters$1.L$2;
                        String str7 = (String) offlineMediaDownloader$downloadPendingChapters$1.L$0;
                        sn.a.g(obj);
                        offlineMediaDownloader$downloadPendingChapters$12 = offlineMediaDownloader$downloadPendingChapters$1;
                        j10 = j14;
                        z10 = z14;
                        str2 = str7;
                        it = it4;
                    }
                } else {
                    sn.a.g(obj);
                    str2 = str;
                    z10 = z6;
                    it = list.iterator();
                    offlineMediaDownloader$downloadPendingChapters$12 = offlineMediaDownloader$downloadPendingChapters$1;
                    j10 = j4;
                }
                while (true) {
                    if (!it.hasNext()) {
                        OfflineChapterEntity next = it.next();
                        offlineMediaDownloader$downloadPendingChapters$12.L$0 = str2;
                        offlineMediaDownloader$downloadPendingChapters$12.L$1 = null;
                        offlineMediaDownloader$downloadPendingChapters$12.L$2 = it;
                        offlineMediaDownloader$downloadPendingChapters$12.L$3 = null;
                        offlineMediaDownloader$downloadPendingChapters$12.J$0 = j10;
                        offlineMediaDownloader$downloadPendingChapters$12.Z$0 = z10;
                        offlineMediaDownloader$downloadPendingChapters$12.label = 1;
                        if (processChapter(j10, str2, next, z10, offlineMediaDownloader$downloadPendingChapters$12) == obj2) {
                            break;
                        }
                    } else {
                        OfflineReadsDao offlineReadsDao = this.offlineReadsDao;
                        offlineMediaDownloader$downloadPendingChapters$12.L$0 = str2;
                        offlineMediaDownloader$downloadPendingChapters$12.L$1 = null;
                        offlineMediaDownloader$downloadPendingChapters$12.L$2 = null;
                        offlineMediaDownloader$downloadPendingChapters$12.L$3 = null;
                        offlineMediaDownloader$downloadPendingChapters$12.J$0 = j10;
                        offlineMediaDownloader$downloadPendingChapters$12.Z$0 = z10;
                        offlineMediaDownloader$downloadPendingChapters$12.label = 2;
                        Object chaptersToDownload = offlineReadsDao.getChaptersToDownload(j10, offlineMediaDownloader$downloadPendingChapters$12);
                        if (chaptersToDownload != obj2) {
                            OfflineMediaDownloader$downloadPendingChapters$1 offlineMediaDownloader$downloadPendingChapters$14 = offlineMediaDownloader$downloadPendingChapters$12;
                            str3 = str2;
                            z11 = z10;
                            long j15 = j10;
                            obj = chaptersToDownload;
                            j11 = j15;
                            offlineMediaDownloader$downloadPendingChapters$1 = offlineMediaDownloader$downloadPendingChapters$14;
                        }
                    }
                }
                arrayList = new ArrayList();
                while (r1.hasNext()) {
                }
                if (arrayList.isEmpty()) {
                }
            }
        }
        offlineMediaDownloader$downloadPendingChapters$1 = new OfflineMediaDownloader$downloadPendingChapters$1(this, cVar);
        Object obj5 = offlineMediaDownloader$downloadPendingChapters$1.result;
        i10 = offlineMediaDownloader$downloadPendingChapters$1.label;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        while (true) {
            if (!it.hasNext()) {
            }
        }
        arrayList = new ArrayList();
        while (r1.hasNext()) {
        }
        if (arrayList.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ensureNotStopped(long j4, c<? super z> cVar) {
        OfflineMediaDownloader$ensureNotStopped$1 offlineMediaDownloader$ensureNotStopped$1;
        int i10;
        OfflineReadEntity offlineReadEntity;
        if (cVar instanceof OfflineMediaDownloader$ensureNotStopped$1) {
            offlineMediaDownloader$ensureNotStopped$1 = (OfflineMediaDownloader$ensureNotStopped$1) cVar;
            int i11 = offlineMediaDownloader$ensureNotStopped$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                offlineMediaDownloader$ensureNotStopped$1.label = i11 - Integer.MIN_VALUE;
                Object obj = offlineMediaDownloader$ensureNotStopped$1.result;
                i10 = offlineMediaDownloader$ensureNotStopped$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    if (!isStopped()) {
                        OfflineReadsDao offlineReadsDao = this.offlineReadsDao;
                        offlineMediaDownloader$ensureNotStopped$1.J$0 = j4;
                        offlineMediaDownloader$ensureNotStopped$1.label = 1;
                        obj = offlineReadsDao.getOfflineReadById(j4, offlineMediaDownloader$ensureNotStopped$1);
                        xn.a aVar = xn.a.f37986a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        throw new StoppedException();
                    }
                }
                offlineReadEntity = (OfflineReadEntity) obj;
                if (offlineReadEntity == null) {
                    if (offlineReadEntity.getStatus() != OfflineReadEntity.Status.ERROR) {
                        return z.f31622a;
                    }
                    throw new StoppedException();
                }
                throw new StoppedException();
            }
        }
        offlineMediaDownloader$ensureNotStopped$1 = new OfflineMediaDownloader$ensureNotStopped$1(this, cVar);
        Object obj2 = offlineMediaDownloader$ensureNotStopped$1.result;
        i10 = offlineMediaDownloader$ensureNotStopped$1.label;
        if (i10 == 0) {
        }
        offlineReadEntity = (OfflineReadEntity) obj2;
        if (offlineReadEntity == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, dc.t] */
    private final t handleNetworkError(Exception e10) {
        this.logger.log(TAG, "Network error (" + e10.getClass().getSimpleName() + "); will retry");
        return new Object();
    }

    private final boolean isStopped() {
        return ((Boolean) getIsStoppedChecker().invoke()).booleanValue();
    }

    public static final boolean isStoppedChecker$lambda$0() {
        return true;
    }

    private final void logFinished(String readId, String voiceId, String status, String errorType, String errorMessage, Double durationSeconds) {
        this.analytics.log(new Analytics.Event.OfflineDownloadFinished(readId, voiceId, status, OfflineReadEntity.Type.MEDIA.getValue(), errorType, errorMessage, durationSeconds));
    }

    public static /* synthetic */ void logFinished$default(OfflineMediaDownloader offlineMediaDownloader, String str, String str2, String str3, String str4, String str5, Double d10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        if ((i10 & 16) != 0) {
            str5 = null;
        }
        if ((i10 & 32) != 0) {
            d10 = null;
        }
        offlineMediaDownloader.logFinished(str, str2, str3, str4, str5, d10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0054, code lost:
    
        if (r15 == r4) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object markStuckChaptersAsError(long j4, c<? super Boolean> cVar) {
        OfflineMediaDownloader$markStuckChaptersAsError$1 offlineMediaDownloader$markStuckChaptersAsError$1;
        int i10;
        ArrayList arrayList;
        long j10;
        Iterator it;
        if (cVar instanceof OfflineMediaDownloader$markStuckChaptersAsError$1) {
            offlineMediaDownloader$markStuckChaptersAsError$1 = (OfflineMediaDownloader$markStuckChaptersAsError$1) cVar;
            int i11 = offlineMediaDownloader$markStuckChaptersAsError$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                offlineMediaDownloader$markStuckChaptersAsError$1.label = i11 - Integer.MIN_VALUE;
                Object obj = offlineMediaDownloader$markStuckChaptersAsError$1.result;
                i10 = offlineMediaDownloader$markStuckChaptersAsError$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            long j11 = offlineMediaDownloader$markStuckChaptersAsError$1.J$0;
                            it = (Iterator) offlineMediaDownloader$markStuckChaptersAsError$1.L$1;
                            sn.a.g(obj);
                            j10 = j11;
                            OfflineMediaDownloader$markStuckChaptersAsError$1 offlineMediaDownloader$markStuckChaptersAsError$12 = offlineMediaDownloader$markStuckChaptersAsError$1;
                            while (it.hasNext()) {
                                OfflineChapterEntity offlineChapterEntity = (OfflineChapterEntity) it.next();
                                OfflineReadsDao offlineReadsDao = this.offlineReadsDao;
                                int chapterIndex = offlineChapterEntity.getChapterIndex();
                                OfflineChapterEntity.Status status = OfflineChapterEntity.Status.ERROR;
                                offlineMediaDownloader$markStuckChaptersAsError$12.L$0 = null;
                                offlineMediaDownloader$markStuckChaptersAsError$12.L$1 = it;
                                offlineMediaDownloader$markStuckChaptersAsError$12.L$2 = null;
                                offlineMediaDownloader$markStuckChaptersAsError$12.J$0 = j10;
                                offlineMediaDownloader$markStuckChaptersAsError$12.label = 2;
                                if (offlineReadsDao.updateChapterStatus(j10, chapterIndex, status, 0, offlineMediaDownloader$markStuckChaptersAsError$12) == aVar) {
                                    return aVar;
                                }
                            }
                            return Boolean.TRUE;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = offlineMediaDownloader$markStuckChaptersAsError$1.J$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    OfflineReadsDao offlineReadsDao2 = this.offlineReadsDao;
                    offlineMediaDownloader$markStuckChaptersAsError$1.J$0 = j4;
                    offlineMediaDownloader$markStuckChaptersAsError$1.label = 1;
                    obj = offlineReadsDao2.getChaptersForRead(j4, offlineMediaDownloader$markStuckChaptersAsError$1);
                }
                arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    OfflineChapterEntity offlineChapterEntity2 = (OfflineChapterEntity) obj2;
                    if (offlineChapterEntity2.getStatus() == OfflineChapterEntity.Status.DOWNLOADING || offlineChapterEntity2.getStatus() == OfflineChapterEntity.Status.PENDING) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return Boolean.FALSE;
                }
                Logger.logWarning$default(this.logger, TAG, n.h(arrayList.size(), "Marking ", " orphaned chapter(s) as ERROR: ", tn.o.E0(arrayList, null, null, null, new fm.d(19), 31)), null, 4, null);
                j10 = j4;
                it = arrayList.iterator();
                OfflineMediaDownloader$markStuckChaptersAsError$1 offlineMediaDownloader$markStuckChaptersAsError$122 = offlineMediaDownloader$markStuckChaptersAsError$1;
                while (it.hasNext()) {
                }
                return Boolean.TRUE;
            }
        }
        offlineMediaDownloader$markStuckChaptersAsError$1 = new OfflineMediaDownloader$markStuckChaptersAsError$1(this, cVar);
        Object obj3 = offlineMediaDownloader$markStuckChaptersAsError$1.result;
        i10 = offlineMediaDownloader$markStuckChaptersAsError$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        arrayList = new ArrayList();
        while (r15.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
    }

    public static final CharSequence markStuckChaptersAsError$lambda$1(OfflineChapterEntity offlineChapterEntity) {
        offlineChapterEntity.getClass();
        return String.valueOf(offlineChapterEntity.getChapterIndex());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0153, code lost:
    
        if (downloadChapter(r2, r4, r5, r6, r7, r8) != r15) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
    
        if (r2.updateChapterStatus(r3, r5, r6, 0, r8) == r15) goto L120;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processChapter(long j4, String str, OfflineChapterEntity offlineChapterEntity, boolean z6, c<? super z> cVar) {
        OfflineMediaDownloader$processChapter$1 offlineMediaDownloader$processChapter$1;
        int i10;
        String fileNumber;
        String str2;
        long j10;
        boolean z10;
        OfflineChapterEntity offlineChapterEntity2;
        long j11;
        boolean z11;
        OfflineChapterEntity offlineChapterEntity3;
        OfflineReadsDao offlineReadsDao;
        int chapterIndex;
        OfflineChapterEntity.Status status;
        OfflineMediaDownloader$processChapter$1 offlineMediaDownloader$processChapter$12;
        long j12;
        boolean z12;
        long j13;
        OfflineReadsDao offlineReadsDao2;
        long j14 = j4;
        boolean z13 = z6;
        try {
            if (cVar instanceof OfflineMediaDownloader$processChapter$1) {
                offlineMediaDownloader$processChapter$1 = (OfflineMediaDownloader$processChapter$1) cVar;
                int i11 = offlineMediaDownloader$processChapter$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    offlineMediaDownloader$processChapter$1.label = i11 - Integer.MIN_VALUE;
                    OfflineMediaDownloader$processChapter$1 offlineMediaDownloader$processChapter$13 = offlineMediaDownloader$processChapter$1;
                    Object obj = offlineMediaDownloader$processChapter$13.result;
                    i10 = offlineMediaDownloader$processChapter$13.label;
                    z zVar = z.f31622a;
                    Object obj2 = xn.a.f37986a;
                    switch (i10) {
                        case 0:
                            sn.a.g(obj);
                            fileNumber = offlineChapterEntity.getFileNumber();
                            if (fileNumber == null) {
                                this.logger.logError(TAG, "No file number for chapter " + offlineChapterEntity.getChapterIndex(), null);
                                OfflineReadsDao offlineReadsDao3 = this.offlineReadsDao;
                                int chapterIndex2 = offlineChapterEntity.getChapterIndex();
                                OfflineChapterEntity.Status status2 = OfflineChapterEntity.Status.ERROR;
                                offlineMediaDownloader$processChapter$13.L$0 = null;
                                offlineMediaDownloader$processChapter$13.L$1 = null;
                                offlineMediaDownloader$processChapter$13.L$2 = null;
                                offlineMediaDownloader$processChapter$13.J$0 = j14;
                                offlineMediaDownloader$processChapter$13.Z$0 = z13;
                                offlineMediaDownloader$processChapter$13.label = 1;
                                break;
                            } else {
                                offlineMediaDownloader$processChapter$13.L$0 = str;
                                offlineMediaDownloader$processChapter$13.L$1 = offlineChapterEntity;
                                offlineMediaDownloader$processChapter$13.L$2 = fileNumber;
                                offlineMediaDownloader$processChapter$13.J$0 = j14;
                                offlineMediaDownloader$processChapter$13.Z$0 = z13;
                                offlineMediaDownloader$processChapter$13.label = 3;
                                if (ensureNotStopped(j14, offlineMediaDownloader$processChapter$13) != obj2) {
                                    str2 = str;
                                    j10 = j14;
                                    z10 = z13;
                                    offlineChapterEntity2 = offlineChapterEntity;
                                    String str3 = fileNumber;
                                    try {
                                        int chapterIndex3 = offlineChapterEntity2.getChapterIndex();
                                        offlineMediaDownloader$processChapter$13.L$0 = null;
                                        offlineMediaDownloader$processChapter$13.L$1 = offlineChapterEntity2;
                                        offlineMediaDownloader$processChapter$13.L$2 = null;
                                        offlineMediaDownloader$processChapter$13.J$0 = j10;
                                        offlineMediaDownloader$processChapter$13.Z$0 = z10;
                                        offlineMediaDownloader$processChapter$13.label = 4;
                                        break;
                                    } catch (Exception e10) {
                                        e = e10;
                                        j11 = j10;
                                        z11 = z10;
                                        offlineChapterEntity3 = offlineChapterEntity2;
                                        this.logger.logError(TAG, n.h(offlineChapterEntity3.getChapterIndex(), "Chapter ", " failed: ", e.getMessage()), e);
                                        OfflineChapterEntity offlineChapterEntity4 = offlineChapterEntity3;
                                        offlineReadsDao = this.offlineReadsDao;
                                        chapterIndex = offlineChapterEntity4.getChapterIndex();
                                        status = OfflineChapterEntity.Status.ERROR;
                                        offlineMediaDownloader$processChapter$13.L$0 = null;
                                        offlineMediaDownloader$processChapter$13.L$1 = null;
                                        offlineMediaDownloader$processChapter$13.L$2 = null;
                                        offlineMediaDownloader$processChapter$13.L$3 = null;
                                        offlineMediaDownloader$processChapter$13.J$0 = j11;
                                        offlineMediaDownloader$processChapter$13.Z$0 = z11;
                                        offlineMediaDownloader$processChapter$13.label = 5;
                                        offlineMediaDownloader$processChapter$12 = offlineMediaDownloader$processChapter$13;
                                        j12 = j11;
                                        if (offlineReadsDao.updateChapterStatus(j12, chapterIndex, status, 0, offlineMediaDownloader$processChapter$12) != obj2) {
                                        }
                                        return obj2;
                                    }
                                }
                            }
                            return obj2;
                        case 1:
                            z13 = offlineMediaDownloader$processChapter$13.Z$0;
                            j14 = offlineMediaDownloader$processChapter$13.J$0;
                            sn.a.g(obj);
                            OfflineReadsDao offlineReadsDao4 = this.offlineReadsDao;
                            offlineMediaDownloader$processChapter$13.L$0 = null;
                            offlineMediaDownloader$processChapter$13.L$1 = null;
                            offlineMediaDownloader$processChapter$13.L$2 = null;
                            offlineMediaDownloader$processChapter$13.J$0 = j14;
                            offlineMediaDownloader$processChapter$13.Z$0 = z13;
                            offlineMediaDownloader$processChapter$13.label = 2;
                            if (offlineReadsDao4.recomputeReadAggregate(j14, offlineMediaDownloader$processChapter$13) != obj2) {
                                return zVar;
                            }
                            return obj2;
                        case 2:
                            sn.a.g(obj);
                            return zVar;
                        case 3:
                            boolean z14 = offlineMediaDownloader$processChapter$13.Z$0;
                            long j15 = offlineMediaDownloader$processChapter$13.J$0;
                            fileNumber = (String) offlineMediaDownloader$processChapter$13.L$2;
                            OfflineChapterEntity offlineChapterEntity5 = (OfflineChapterEntity) offlineMediaDownloader$processChapter$13.L$1;
                            String str4 = (String) offlineMediaDownloader$processChapter$13.L$0;
                            sn.a.g(obj);
                            j10 = j15;
                            str2 = str4;
                            offlineChapterEntity2 = offlineChapterEntity5;
                            z10 = z14;
                            String str32 = fileNumber;
                            int chapterIndex32 = offlineChapterEntity2.getChapterIndex();
                            offlineMediaDownloader$processChapter$13.L$0 = null;
                            offlineMediaDownloader$processChapter$13.L$1 = offlineChapterEntity2;
                            offlineMediaDownloader$processChapter$13.L$2 = null;
                            offlineMediaDownloader$processChapter$13.J$0 = j10;
                            offlineMediaDownloader$processChapter$13.Z$0 = z10;
                            offlineMediaDownloader$processChapter$13.label = 4;
                            break;
                        case 4:
                            z11 = offlineMediaDownloader$processChapter$13.Z$0;
                            j11 = offlineMediaDownloader$processChapter$13.J$0;
                            offlineChapterEntity3 = (OfflineChapterEntity) offlineMediaDownloader$processChapter$13.L$1;
                            try {
                                sn.a.g(obj);
                            } catch (Exception e11) {
                                e = e11;
                                this.logger.logError(TAG, n.h(offlineChapterEntity3.getChapterIndex(), "Chapter ", " failed: ", e.getMessage()), e);
                                OfflineChapterEntity offlineChapterEntity42 = offlineChapterEntity3;
                                offlineReadsDao = this.offlineReadsDao;
                                chapterIndex = offlineChapterEntity42.getChapterIndex();
                                status = OfflineChapterEntity.Status.ERROR;
                                offlineMediaDownloader$processChapter$13.L$0 = null;
                                offlineMediaDownloader$processChapter$13.L$1 = null;
                                offlineMediaDownloader$processChapter$13.L$2 = null;
                                offlineMediaDownloader$processChapter$13.L$3 = null;
                                offlineMediaDownloader$processChapter$13.J$0 = j11;
                                offlineMediaDownloader$processChapter$13.Z$0 = z11;
                                offlineMediaDownloader$processChapter$13.label = 5;
                                offlineMediaDownloader$processChapter$12 = offlineMediaDownloader$processChapter$13;
                                j12 = j11;
                                if (offlineReadsDao.updateChapterStatus(j12, chapterIndex, status, 0, offlineMediaDownloader$processChapter$12) != obj2) {
                                    z12 = z11;
                                    j13 = j12;
                                    offlineReadsDao2 = this.offlineReadsDao;
                                    offlineMediaDownloader$processChapter$12.L$0 = null;
                                    offlineMediaDownloader$processChapter$12.L$1 = null;
                                    offlineMediaDownloader$processChapter$12.L$2 = null;
                                    offlineMediaDownloader$processChapter$12.L$3 = null;
                                    offlineMediaDownloader$processChapter$12.J$0 = j13;
                                    offlineMediaDownloader$processChapter$12.Z$0 = z12;
                                    offlineMediaDownloader$processChapter$12.label = 6;
                                    if (offlineReadsDao2.recomputeReadAggregate(j13, offlineMediaDownloader$processChapter$12) == obj2) {
                                    }
                                }
                                return obj2;
                            }
                            return zVar;
                        case 5:
                            z12 = offlineMediaDownloader$processChapter$13.Z$0;
                            j13 = offlineMediaDownloader$processChapter$13.J$0;
                            sn.a.g(obj);
                            offlineMediaDownloader$processChapter$12 = offlineMediaDownloader$processChapter$13;
                            offlineReadsDao2 = this.offlineReadsDao;
                            offlineMediaDownloader$processChapter$12.L$0 = null;
                            offlineMediaDownloader$processChapter$12.L$1 = null;
                            offlineMediaDownloader$processChapter$12.L$2 = null;
                            offlineMediaDownloader$processChapter$12.L$3 = null;
                            offlineMediaDownloader$processChapter$12.J$0 = j13;
                            offlineMediaDownloader$processChapter$12.Z$0 = z12;
                            offlineMediaDownloader$processChapter$12.label = 6;
                            if (offlineReadsDao2.recomputeReadAggregate(j13, offlineMediaDownloader$processChapter$12) == obj2) {
                                return zVar;
                            }
                            break;
                        case 6:
                            sn.a.g(obj);
                            return zVar;
                        default:
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (i10) {
            }
        } catch (StoppedException e12) {
            throw e12;
        } catch (IOException e13) {
            throw e13;
        } catch (CancellationException e14) {
            throw e14;
        }
        offlineMediaDownloader$processChapter$1 = new OfflineMediaDownloader$processChapter$1(this, cVar);
        OfflineMediaDownloader$processChapter$1 offlineMediaDownloader$processChapter$132 = offlineMediaDownloader$processChapter$1;
        Object obj3 = offlineMediaDownloader$processChapter$132.result;
        i10 = offlineMediaDownloader$processChapter$132.label;
        z zVar2 = z.f31622a;
        Object obj22 = xn.a.f37986a;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x0497: MOVE (r10 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]) (LINE:1176), block:B:130:0x0497 */
    @Override // io.elevenlabs.data.worker.OfflineDownloader
    public java.lang.Object doWork(long r23, wn.c<? super dc.t> r25) {
        /*
            Method dump skipped, instructions count: 1626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.elevenlabs.data.worker.OfflineMediaDownloader.doWork(long, wn.c):java.lang.Object");
    }

    @Override // io.elevenlabs.data.worker.OfflineDownloader
    /* renamed from: isStoppedChecker, reason: from getter */
    public ho.a getIsStoppedChecker() {
        return this.isStoppedChecker;
    }

    @Override // io.elevenlabs.data.worker.OfflineDownloader
    public void setStoppedChecker(ho.a aVar) {
        aVar.getClass();
        this.isStoppedChecker = aVar;
    }
}
