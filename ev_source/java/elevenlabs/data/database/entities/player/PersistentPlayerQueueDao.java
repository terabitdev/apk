package io.elevenlabs.data.database.entities.player;

import com.google.protobuf.c6;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;
import xn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\n\u0010\tJ\u001e\u0010\u000b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0097@¢\u0006\u0004\b\u000b\u0010\u0007¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueDao;", "", "", "Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueEntity;", "entities", "Lsn/z;", "insertAll", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "deleteAll", "(Lwn/c;)Ljava/lang/Object;", "getAll", "replaceAll", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface PersistentPlayerQueueDao {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Object replaceAll(PersistentPlayerQueueDao persistentPlayerQueueDao, List<PersistentPlayerQueueEntity> list, c<? super z> cVar) {
            return PersistentPlayerQueueDao.super.replaceAll(list, cVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r5.insertAll(r6, r0) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r5.deleteAll(r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object replaceAll$suspendImpl(PersistentPlayerQueueDao persistentPlayerQueueDao, List<PersistentPlayerQueueEntity> list, c<? super z> cVar) {
        PersistentPlayerQueueDao$replaceAll$1 persistentPlayerQueueDao$replaceAll$1;
        int i10;
        if (cVar instanceof PersistentPlayerQueueDao$replaceAll$1) {
            persistentPlayerQueueDao$replaceAll$1 = (PersistentPlayerQueueDao$replaceAll$1) cVar;
            int i11 = persistentPlayerQueueDao$replaceAll$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                persistentPlayerQueueDao$replaceAll$1.label = i11 - Integer.MIN_VALUE;
                Object obj = persistentPlayerQueueDao$replaceAll$1.result;
                i10 = persistentPlayerQueueDao$replaceAll$1.label;
                a aVar = a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return z.f31622a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) persistentPlayerQueueDao$replaceAll$1.L$1;
                    persistentPlayerQueueDao = (PersistentPlayerQueueDao) persistentPlayerQueueDao$replaceAll$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    persistentPlayerQueueDao$replaceAll$1.L$0 = persistentPlayerQueueDao;
                    persistentPlayerQueueDao$replaceAll$1.L$1 = list;
                    persistentPlayerQueueDao$replaceAll$1.label = 1;
                }
                persistentPlayerQueueDao$replaceAll$1.L$0 = null;
                persistentPlayerQueueDao$replaceAll$1.L$1 = null;
                persistentPlayerQueueDao$replaceAll$1.label = 2;
            }
        }
        persistentPlayerQueueDao$replaceAll$1 = new PersistentPlayerQueueDao$replaceAll$1(persistentPlayerQueueDao, cVar);
        Object obj2 = persistentPlayerQueueDao$replaceAll$1.result;
        i10 = persistentPlayerQueueDao$replaceAll$1.label;
        a aVar2 = a.f37986a;
        if (i10 == 0) {
        }
        persistentPlayerQueueDao$replaceAll$1.L$0 = null;
        persistentPlayerQueueDao$replaceAll$1.L$1 = null;
        persistentPlayerQueueDao$replaceAll$1.label = 2;
    }

    Object deleteAll(c<? super z> cVar);

    Object getAll(c<? super List<PersistentPlayerQueueEntity>> cVar);

    Object insertAll(List<PersistentPlayerQueueEntity> list, c<? super z> cVar);

    default Object replaceAll(List<PersistentPlayerQueueEntity> list, c<? super z> cVar) {
        return replaceAll$suspendImpl(this, list, cVar);
    }
}
