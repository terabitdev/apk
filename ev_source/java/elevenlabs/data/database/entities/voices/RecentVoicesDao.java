package io.elevenlabs.data.database.entities.voices;

import com.google.protobuf.c6;
import ir.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\t\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0010\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0097@¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020\u0012H'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/database/entities/voices/RecentVoicesDao;", "", "", "Lio/elevenlabs/data/database/entities/voices/VoiceEntity;", "entities", "Lsn/z;", "upsertVoices", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/database/entities/voices/RecentVoiceEntity;", "insertRecentVoices", "entity", "insertRecentVoice", "(Lio/elevenlabs/data/database/entities/voices/RecentVoiceEntity;Lwn/c;)Ljava/lang/Object;", "voices", "", "lastUsedAtUnixMillis", "insertAll", "(Ljava/util/List;JLwn/c;)Ljava/lang/Object;", "Lir/i;", "observeRecentVoices", "()Lir/i;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface RecentVoicesDao {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Object insertAll(RecentVoicesDao recentVoicesDao, List<VoiceEntity> list, long j4, wn.c<? super z> cVar) {
            return RecentVoicesDao.super.insertAll(list, j4, cVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (r5.insertRecentVoices(r9, r0) != r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r5.upsertVoices(r6, r0) == r4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[LOOP:0: B:18:0x006d->B:20:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object insertAll$suspendImpl(RecentVoicesDao recentVoicesDao, List<VoiceEntity> list, long j4, wn.c<? super z> cVar) {
        RecentVoicesDao$insertAll$1 recentVoicesDao$insertAll$1;
        int i10;
        Iterator<T> it;
        if (cVar instanceof RecentVoicesDao$insertAll$1) {
            recentVoicesDao$insertAll$1 = (RecentVoicesDao$insertAll$1) cVar;
            int i11 = recentVoicesDao$insertAll$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                recentVoicesDao$insertAll$1.label = i11 - Integer.MIN_VALUE;
                Object obj = recentVoicesDao$insertAll$1.result;
                i10 = recentVoicesDao$insertAll$1.label;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return z.f31622a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = recentVoicesDao$insertAll$1.J$0;
                    list = (List) recentVoicesDao$insertAll$1.L$1;
                    recentVoicesDao = (RecentVoicesDao) recentVoicesDao$insertAll$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    recentVoicesDao$insertAll$1.L$0 = recentVoicesDao;
                    recentVoicesDao$insertAll$1.L$1 = list;
                    recentVoicesDao$insertAll$1.J$0 = j4;
                    recentVoicesDao$insertAll$1.label = 1;
                }
                ArrayList arrayList = new ArrayList(p.a0(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new RecentVoiceEntity(((VoiceEntity) it.next()).getVoiceId(), j4));
                }
                recentVoicesDao$insertAll$1.L$0 = null;
                recentVoicesDao$insertAll$1.L$1 = null;
                recentVoicesDao$insertAll$1.L$2 = null;
                recentVoicesDao$insertAll$1.J$0 = j4;
                recentVoicesDao$insertAll$1.label = 2;
            }
        }
        recentVoicesDao$insertAll$1 = new RecentVoicesDao$insertAll$1(recentVoicesDao, cVar);
        Object obj2 = recentVoicesDao$insertAll$1.result;
        i10 = recentVoicesDao$insertAll$1.label;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        ArrayList arrayList2 = new ArrayList(p.a0(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
        }
        recentVoicesDao$insertAll$1.L$0 = null;
        recentVoicesDao$insertAll$1.L$1 = null;
        recentVoicesDao$insertAll$1.L$2 = null;
        recentVoicesDao$insertAll$1.J$0 = j4;
        recentVoicesDao$insertAll$1.label = 2;
    }

    default Object insertAll(List<VoiceEntity> list, long j4, wn.c<? super z> cVar) {
        return insertAll$suspendImpl(this, list, j4, cVar);
    }

    Object insertRecentVoice(RecentVoiceEntity recentVoiceEntity, wn.c<? super z> cVar);

    Object insertRecentVoices(List<RecentVoiceEntity> list, wn.c<? super z> cVar);

    i observeRecentVoices();

    Object upsertVoices(List<VoiceEntity> list, wn.c<? super z> cVar);
}
