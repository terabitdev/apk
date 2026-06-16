package io.elevenlabs.data.database.entities.offline;

import ae.l;
import com.google.protobuf.c6;
import io.elevenlabs.data.database.entities.offline.OfflineChapterEntity;
import io.elevenlabs.data.database.entities.offline.OfflineReadEntity;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.n;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006J(\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\u0010H'¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00110\u0010H'¢\u0006\u0004\b \u0010\u0013J\u0018\u0010!\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b!\u0010\u0006J\u0018\u0010\"\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0007H§@¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%H§@¢\u0006\u0004\b&\u0010$J\u001e\u0010)\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0011H§@¢\u0006\u0004\b)\u0010*J(\u0010,\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020+2\u0006\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b,\u0010-J0\u0010/\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020+2\u0006\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b/\u00100J(\u00102\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\f2\u0006\u00101\u001a\u00020\u001bH§@¢\u0006\u0004\b2\u00103J(\u00105\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\f2\u0006\u00104\u001a\u00020\u001bH§@¢\u0006\u0004\b5\u00103J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00020'0\u00112\u0006\u0010\u0018\u001a\u00020\u0004H§@¢\u0006\u0004\b6\u0010\u001aJ\u001e\u00107\u001a\b\u0012\u0004\u0012\u00020'0\u00112\u0006\u0010\u0018\u001a\u00020\u0004H§@¢\u0006\u0004\b7\u0010\u001aJ \u00108\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\fH§@¢\u0006\u0004\b8\u00109J\u001e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010:\u001a\u00020\u0004H§@¢\u0006\u0004\b;\u0010\u001aJ \u0010<\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\fH§@¢\u0006\u0004\b<\u00109J8\u0010>\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020+2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010=\u001a\u00020\u0004H§@¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0004H\u0097@¢\u0006\u0004\b@\u0010\u001a¨\u0006AÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/database/entities/offline/OfflineReadsDao;", "", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;", "offlineRead", "", "insert", "(Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity;Lwn/c;)Ljava/lang/Object;", "Lsn/z;", "update", "id", "Lio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Status;", "status", "", "progress", "updateStatusAndProgress", "(JLio/elevenlabs/data/database/entities/offline/OfflineReadEntity$Status;ILwn/c;)Ljava/lang/Object;", "Lir/i;", "", "observeAllOfflineReads", "()Lir/i;", "Lio/elevenlabs/data/database/entities/offline/OfflineReadWithChapters;", "observeAllOfflineReadsWithChapters", "getAllOfflineReads", "()Ljava/util/List;", "offlineReadId", "getOfflineReadById", "(JLwn/c;)Ljava/lang/Object;", "", "readId", "getOfflineReadByReadId", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/database/entities/reads/ReadMetaEntityWithChapters;", "getReadsWithOfflineEntries", "delete", "deleteOfflineReads", "deleteAll", "(Lwn/c;)Ljava/lang/Object;", "", "hasOfflineReads", "Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity;", "chapters", "insertChapters", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;", "resetAllChapterStatuses", "(JLio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;ILwn/c;)Ljava/lang/Object;", "chapterIndex", "updateChapterStatus", "(JILio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;ILwn/c;)Ljava/lang/Object;", "url", "updateChapterManifestUrl", "(JILjava/lang/String;Lwn/c;)Ljava/lang/Object;", "keySetId", "updateChapterDrmKeySetId", "getChaptersToDownload", "getChaptersForRead", "deleteChapter", "(JILwn/c;)Ljava/lang/Object;", "nowMillis", "getOfflineReadIdsWithExpiredChapters", "markChapterExpired", "expiresAtUnix", "updateChapterStatusAndExpiry", "(JILio/elevenlabs/data/database/entities/offline/OfflineChapterEntity$Status;IJLwn/c;)Ljava/lang/Object;", "recomputeReadAggregate", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface OfflineReadsDao {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Object recomputeReadAggregate(OfflineReadsDao offlineReadsDao, long j4, wn.c<? super z> cVar) {
            return OfflineReadsDao.super.recomputeReadAggregate(j4, cVar);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OfflineReadEntity.Type.values().length];
            try {
                iArr[OfflineReadEntity.Type.TTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineReadEntity.Type.MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OfflineChapterEntity.Status.values().length];
            try {
                iArr2[OfflineChapterEntity.Status.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OfflineChapterEntity.Status.DOWNLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0081, code lost:
    
        if (r3 == r12) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object recomputeReadAggregate$suspendImpl(OfflineReadsDao offlineReadsDao, long j4, wn.c<? super z> cVar) {
        OfflineReadsDao$recomputeReadAggregate$1 offlineReadsDao$recomputeReadAggregate$1;
        int i10;
        OfflineReadEntity offlineReadEntity;
        OfflineReadsDao offlineReadsDao2;
        long j10;
        OfflineReadEntity offlineReadEntity2;
        List list;
        int i11;
        int i12;
        int i13;
        int i14;
        OfflineReadEntity.Status status;
        int i15;
        OfflineReadsDao offlineReadsDao3 = offlineReadsDao;
        long j11 = j4;
        if (cVar instanceof OfflineReadsDao$recomputeReadAggregate$1) {
            offlineReadsDao$recomputeReadAggregate$1 = (OfflineReadsDao$recomputeReadAggregate$1) cVar;
            int i16 = offlineReadsDao$recomputeReadAggregate$1.label;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                offlineReadsDao$recomputeReadAggregate$1.label = i16 - Integer.MIN_VALUE;
                OfflineReadsDao$recomputeReadAggregate$1 offlineReadsDao$recomputeReadAggregate$12 = offlineReadsDao$recomputeReadAggregate$1;
                Object obj = offlineReadsDao$recomputeReadAggregate$12.result;
                i10 = offlineReadsDao$recomputeReadAggregate$12.label;
                z zVar = z.f31622a;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                sn.a.g(obj);
                                return zVar;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j10 = offlineReadsDao$recomputeReadAggregate$12.J$0;
                        offlineReadEntity2 = (OfflineReadEntity) offlineReadsDao$recomputeReadAggregate$12.L$1;
                        offlineReadsDao2 = (OfflineReadsDao) offlineReadsDao$recomputeReadAggregate$12.L$0;
                        sn.a.g(obj);
                        list = (List) obj;
                        if (!list.isEmpty()) {
                            return zVar;
                        }
                        Set f12 = n.f1(new OfflineChapterEntity.Status[]{OfflineChapterEntity.Status.READY, OfflineChapterEntity.Status.EXPIRED});
                        if (!list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (!f12.contains(((OfflineChapterEntity) it.next()).getStatus())) {
                                    i11 = 0;
                                    break;
                                }
                            }
                        }
                        i11 = 1;
                        if (!list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (((OfflineChapterEntity) it2.next()).getStatus() == OfflineChapterEntity.Status.DOWNLOADING) {
                                    i12 = 1;
                                    break;
                                }
                            }
                        }
                        i12 = 0;
                        if (!list.isEmpty()) {
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                if (((OfflineChapterEntity) it3.next()).getStatus() == OfflineChapterEntity.Status.PENDING) {
                                    i13 = 1;
                                    break;
                                }
                            }
                        }
                        i13 = 0;
                        if (!list.isEmpty()) {
                            Iterator it4 = list.iterator();
                            while (it4.hasNext()) {
                                if (((OfflineChapterEntity) it4.next()).getStatus() == OfflineChapterEntity.Status.ERROR) {
                                    i14 = 1;
                                    break;
                                }
                            }
                        }
                        i14 = 0;
                        int i17 = WhenMappings.$EnumSwitchMapping$0[offlineReadEntity2.getType().ordinal()];
                        if (i17 != 1) {
                            if (i17 == 2) {
                                status = OfflineReadEntity.Status.DOWNLOADING_MEDIA;
                            } else {
                                c6.p();
                                return null;
                            }
                        } else {
                            status = OfflineReadEntity.Status.DOWNLOADING_CHUNKS;
                        }
                        if (i11 != 0) {
                            status = OfflineReadEntity.Status.READY;
                        } else if (i12 == 0 && i13 == 0 && i14 != 0) {
                            status = OfflineReadEntity.Status.ERROR;
                        }
                        Iterator it5 = list.iterator();
                        int i18 = 0;
                        while (true) {
                            i15 = 100;
                            if (!it5.hasNext()) {
                                break;
                            }
                            OfflineChapterEntity offlineChapterEntity = (OfflineChapterEntity) it5.next();
                            OfflineReadEntity.Status status2 = status;
                            int i19 = WhenMappings.$EnumSwitchMapping$1[offlineChapterEntity.getStatus().ordinal()];
                            if (i19 != 1) {
                                if (i19 != 2) {
                                    i15 = 0;
                                } else {
                                    i15 = offlineChapterEntity.getProgress();
                                }
                            }
                            i18 += i15;
                            status = status2;
                        }
                        OfflineReadEntity.Status status3 = status;
                        if (i11 == 0) {
                            i15 = l.m(i18 / list.size(), 0, 99);
                        }
                        int i20 = i15;
                        offlineReadsDao$recomputeReadAggregate$12.L$0 = null;
                        offlineReadsDao$recomputeReadAggregate$12.L$1 = null;
                        offlineReadsDao$recomputeReadAggregate$12.L$2 = null;
                        offlineReadsDao$recomputeReadAggregate$12.L$3 = null;
                        offlineReadsDao$recomputeReadAggregate$12.L$4 = null;
                        offlineReadsDao$recomputeReadAggregate$12.L$5 = null;
                        offlineReadsDao$recomputeReadAggregate$12.J$0 = j10;
                        offlineReadsDao$recomputeReadAggregate$12.I$0 = i11;
                        offlineReadsDao$recomputeReadAggregate$12.I$1 = i12;
                        offlineReadsDao$recomputeReadAggregate$12.I$2 = i13;
                        offlineReadsDao$recomputeReadAggregate$12.I$3 = i14;
                        offlineReadsDao$recomputeReadAggregate$12.I$4 = i18;
                        offlineReadsDao$recomputeReadAggregate$12.I$5 = i20;
                        offlineReadsDao$recomputeReadAggregate$12.label = 3;
                        if (offlineReadsDao2.updateStatusAndProgress(j10, status3, i20, offlineReadsDao$recomputeReadAggregate$12) == aVar) {
                            return aVar;
                        }
                        return zVar;
                    }
                    long j12 = offlineReadsDao$recomputeReadAggregate$12.J$0;
                    OfflineReadsDao offlineReadsDao4 = (OfflineReadsDao) offlineReadsDao$recomputeReadAggregate$12.L$0;
                    sn.a.g(obj);
                    offlineReadsDao3 = offlineReadsDao4;
                    j11 = j12;
                } else {
                    sn.a.g(obj);
                    offlineReadsDao$recomputeReadAggregate$12.L$0 = offlineReadsDao3;
                    offlineReadsDao$recomputeReadAggregate$12.J$0 = j11;
                    offlineReadsDao$recomputeReadAggregate$12.label = 1;
                    obj = offlineReadsDao3.getOfflineReadById(j11, offlineReadsDao$recomputeReadAggregate$12);
                }
                offlineReadEntity = (OfflineReadEntity) obj;
                if (offlineReadEntity != null) {
                    return zVar;
                }
                offlineReadsDao$recomputeReadAggregate$12.L$0 = offlineReadsDao3;
                offlineReadsDao$recomputeReadAggregate$12.L$1 = offlineReadEntity;
                offlineReadsDao$recomputeReadAggregate$12.J$0 = j11;
                offlineReadsDao$recomputeReadAggregate$12.label = 2;
                Object chaptersForRead = offlineReadsDao3.getChaptersForRead(j11, offlineReadsDao$recomputeReadAggregate$12);
                if (chaptersForRead != aVar) {
                    offlineReadsDao2 = offlineReadsDao3;
                    j10 = j11;
                    offlineReadEntity2 = offlineReadEntity;
                    obj = chaptersForRead;
                    list = (List) obj;
                    if (!list.isEmpty()) {
                    }
                }
                return aVar;
            }
        }
        offlineReadsDao$recomputeReadAggregate$1 = new OfflineReadsDao$recomputeReadAggregate$1(offlineReadsDao3, cVar);
        OfflineReadsDao$recomputeReadAggregate$1 offlineReadsDao$recomputeReadAggregate$122 = offlineReadsDao$recomputeReadAggregate$1;
        Object obj2 = offlineReadsDao$recomputeReadAggregate$122.result;
        i10 = offlineReadsDao$recomputeReadAggregate$122.label;
        z zVar2 = z.f31622a;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        offlineReadEntity = (OfflineReadEntity) obj2;
        if (offlineReadEntity != null) {
        }
    }

    Object delete(OfflineReadEntity offlineReadEntity, wn.c<? super z> cVar);

    Object deleteAll(wn.c<? super z> cVar);

    Object deleteChapter(long j4, int i10, wn.c<? super z> cVar);

    Object deleteOfflineReads(String str, wn.c<? super z> cVar);

    List<OfflineReadEntity> getAllOfflineReads();

    Object getChaptersForRead(long j4, wn.c<? super List<OfflineChapterEntity>> cVar);

    Object getChaptersToDownload(long j4, wn.c<? super List<OfflineChapterEntity>> cVar);

    Object getOfflineReadById(long j4, wn.c<? super OfflineReadEntity> cVar);

    Object getOfflineReadByReadId(String str, wn.c<? super OfflineReadEntity> cVar);

    Object getOfflineReadIdsWithExpiredChapters(long j4, wn.c<? super List<Long>> cVar);

    ir.i getReadsWithOfflineEntries();

    Object hasOfflineReads(wn.c<? super Boolean> cVar);

    Object insert(OfflineReadEntity offlineReadEntity, wn.c<? super Long> cVar);

    Object insertChapters(List<OfflineChapterEntity> list, wn.c<? super z> cVar);

    Object markChapterExpired(long j4, int i10, wn.c<? super z> cVar);

    ir.i observeAllOfflineReads();

    ir.i observeAllOfflineReadsWithChapters();

    default Object recomputeReadAggregate(long j4, wn.c<? super z> cVar) {
        return recomputeReadAggregate$suspendImpl(this, j4, cVar);
    }

    Object resetAllChapterStatuses(long j4, OfflineChapterEntity.Status status, int i10, wn.c<? super z> cVar);

    Object update(OfflineReadEntity offlineReadEntity, wn.c<? super z> cVar);

    Object updateChapterDrmKeySetId(long j4, int i10, String str, wn.c<? super z> cVar);

    Object updateChapterManifestUrl(long j4, int i10, String str, wn.c<? super z> cVar);

    Object updateChapterStatus(long j4, int i10, OfflineChapterEntity.Status status, int i11, wn.c<? super z> cVar);

    Object updateChapterStatusAndExpiry(long j4, int i10, OfflineChapterEntity.Status status, int i11, long j10, wn.c<? super z> cVar);

    Object updateStatusAndProgress(long j4, OfflineReadEntity.Status status, int i10, wn.c<? super z> cVar);
}
