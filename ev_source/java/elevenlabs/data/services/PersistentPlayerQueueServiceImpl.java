package io.elevenlabs.data.services;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.c6;
import io.elevenlabs.data.database.entities.player.PersistentPlayerQueueDao;
import io.elevenlabs.data.database.entities.player.PersistentPlayerQueueEntity;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.PersistentPlayerQueueService;
import io.elevenlabs.domain.services.ReadsService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.a0;
import tn.o;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/data/services/PersistentPlayerQueueServiceImpl;", "Lio/elevenlabs/domain/services/PersistentPlayerQueueService;", "Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueDao;", "dao", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "<init>", "(Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueDao;Lio/elevenlabs/domain/services/ReadsService;)V", "", "", FirebaseAnalytics.Param.ITEMS, "Lsn/z;", "saveQueueItems", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/ReadMeta;", "getLastQueueItems", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/database/entities/player/PersistentPlayerQueueDao;", "Lio/elevenlabs/domain/services/ReadsService;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PersistentPlayerQueueServiceImpl implements PersistentPlayerQueueService {
    private final PersistentPlayerQueueDao dao;
    private final ReadsService readsService;

    public PersistentPlayerQueueServiceImpl(PersistentPlayerQueueDao persistentPlayerQueueDao, ReadsService readsService) {
        persistentPlayerQueueDao.getClass();
        readsService.getClass();
        this.dao = persistentPlayerQueueDao;
        this.readsService = readsService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (r8 == r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[LOOP:0: B:21:0x0062->B:23:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[LOOP:1: B:26:0x0092->B:28:0x0098, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // io.elevenlabs.domain.services.PersistentPlayerQueueService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getLastQueueItems(wn.c<? super List<ReadMeta>> cVar) {
        PersistentPlayerQueueServiceImpl$getLastQueueItems$1 persistentPlayerQueueServiceImpl$getLastQueueItems$1;
        Object obj;
        int i10;
        xn.a aVar;
        int H;
        Iterator it;
        final Map map;
        if (cVar instanceof PersistentPlayerQueueServiceImpl$getLastQueueItems$1) {
            persistentPlayerQueueServiceImpl$getLastQueueItems$1 = (PersistentPlayerQueueServiceImpl$getLastQueueItems$1) cVar;
            int i11 = persistentPlayerQueueServiceImpl$getLastQueueItems$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                persistentPlayerQueueServiceImpl$getLastQueueItems$1.label = i11 - Integer.MIN_VALUE;
                obj = persistentPlayerQueueServiceImpl$getLastQueueItems$1.result;
                i10 = persistentPlayerQueueServiceImpl$getLastQueueItems$1.label;
                aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            map = (Map) persistentPlayerQueueServiceImpl$getLastQueueItems$1.L$0;
                            sn.a.g(obj);
                            return o.a1(new Comparator() { // from class: io.elevenlabs.data.services.PersistentPlayerQueueServiceImpl$getLastQueueItems$$inlined$sortedBy$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t10, T t11) {
                                    int i12;
                                    Integer num = (Integer) map.get(((ReadMeta) t10).getReadId());
                                    int i13 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                                    if (num != null) {
                                        i12 = num.intValue();
                                    } else {
                                        i12 = Integer.MAX_VALUE;
                                    }
                                    Integer valueOf = Integer.valueOf(i12);
                                    Integer num2 = (Integer) map.get(((ReadMeta) t11).getReadId());
                                    if (num2 != null) {
                                        i13 = num2.intValue();
                                    }
                                    return wn.e.g(valueOf, Integer.valueOf(i13));
                                }
                            }, (Iterable) obj);
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    PersistentPlayerQueueDao persistentPlayerQueueDao = this.dao;
                    persistentPlayerQueueServiceImpl$getLastQueueItems$1.label = 1;
                    obj = persistentPlayerQueueDao.getAll(persistentPlayerQueueServiceImpl$getLastQueueItems$1);
                }
                Iterable<PersistentPlayerQueueEntity> iterable = (Iterable) obj;
                H = a0.H(p.a0(iterable, 10));
                if (H < 16) {
                    H = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(H);
                for (PersistentPlayerQueueEntity persistentPlayerQueueEntity : iterable) {
                    linkedHashMap.put(persistentPlayerQueueEntity.getReadId(), new Integer(persistentPlayerQueueEntity.getPosition()));
                }
                ReadsService readsService = this.readsService;
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getKey());
                }
                persistentPlayerQueueServiceImpl$getLastQueueItems$1.L$0 = linkedHashMap;
                persistentPlayerQueueServiceImpl$getLastQueueItems$1.label = 2;
                obj = readsService.getReads(arrayList, persistentPlayerQueueServiceImpl$getLastQueueItems$1);
                if (obj != aVar) {
                    map = linkedHashMap;
                    return o.a1(new Comparator() { // from class: io.elevenlabs.data.services.PersistentPlayerQueueServiceImpl$getLastQueueItems$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t10, T t11) {
                            int i12;
                            Integer num = (Integer) map.get(((ReadMeta) t10).getReadId());
                            int i13 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                            if (num != null) {
                                i12 = num.intValue();
                            } else {
                                i12 = Integer.MAX_VALUE;
                            }
                            Integer valueOf = Integer.valueOf(i12);
                            Integer num2 = (Integer) map.get(((ReadMeta) t11).getReadId());
                            if (num2 != null) {
                                i13 = num2.intValue();
                            }
                            return wn.e.g(valueOf, Integer.valueOf(i13));
                        }
                    }, (Iterable) obj);
                }
                return aVar;
            }
        }
        persistentPlayerQueueServiceImpl$getLastQueueItems$1 = new PersistentPlayerQueueServiceImpl$getLastQueueItems$1(this, cVar);
        obj = persistentPlayerQueueServiceImpl$getLastQueueItems$1.result;
        i10 = persistentPlayerQueueServiceImpl$getLastQueueItems$1.label;
        aVar = xn.a.f37986a;
        if (i10 == 0) {
        }
        Iterable<PersistentPlayerQueueEntity> iterable2 = (Iterable) obj;
        H = a0.H(p.a0(iterable2, 10));
        if (H < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(H);
        while (r8.hasNext()) {
        }
        ReadsService readsService2 = this.readsService;
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
        it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
        }
        persistentPlayerQueueServiceImpl$getLastQueueItems$1.L$0 = linkedHashMap2;
        persistentPlayerQueueServiceImpl$getLastQueueItems$1.label = 2;
        obj = readsService2.getReads(arrayList2, persistentPlayerQueueServiceImpl$getLastQueueItems$1);
        if (obj != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(2:10|11)(2:15|16))(7:17|18|(3:21|(1:23)(3:24|25|26)|19)|27|28|29|(1:31))|12|13))|33|6|7|(0)(0)|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // io.elevenlabs.domain.services.PersistentPlayerQueueService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object saveQueueItems(List<String> list, wn.c<? super z> cVar) {
        PersistentPlayerQueueServiceImpl$saveQueueItems$1 persistentPlayerQueueServiceImpl$saveQueueItems$1;
        int i10;
        if (cVar instanceof PersistentPlayerQueueServiceImpl$saveQueueItems$1) {
            persistentPlayerQueueServiceImpl$saveQueueItems$1 = (PersistentPlayerQueueServiceImpl$saveQueueItems$1) cVar;
            int i11 = persistentPlayerQueueServiceImpl$saveQueueItems$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                persistentPlayerQueueServiceImpl$saveQueueItems$1.label = i11 - Integer.MIN_VALUE;
                Object obj = persistentPlayerQueueServiceImpl$saveQueueItems$1.result;
                i10 = persistentPlayerQueueServiceImpl$saveQueueItems$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    PersistentPlayerQueueDao persistentPlayerQueueDao = this.dao;
                    ArrayList arrayList = new ArrayList(p.a0(list, 10));
                    int i12 = 0;
                    for (Object obj2 : list) {
                        int i13 = i12 + 1;
                        if (i12 >= 0) {
                            arrayList.add(new PersistentPlayerQueueEntity((String) obj2, i12));
                            i12 = i13;
                        } else {
                            ig.f.U();
                            throw null;
                        }
                    }
                    persistentPlayerQueueServiceImpl$saveQueueItems$1.L$0 = null;
                    persistentPlayerQueueServiceImpl$saveQueueItems$1.L$1 = null;
                    persistentPlayerQueueServiceImpl$saveQueueItems$1.I$0 = 0;
                    persistentPlayerQueueServiceImpl$saveQueueItems$1.label = 1;
                    Object replaceAll = persistentPlayerQueueDao.replaceAll(arrayList, persistentPlayerQueueServiceImpl$saveQueueItems$1);
                    xn.a aVar = xn.a.f37986a;
                    if (replaceAll == aVar) {
                        return aVar;
                    }
                }
                return z.f31622a;
            }
        }
        persistentPlayerQueueServiceImpl$saveQueueItems$1 = new PersistentPlayerQueueServiceImpl$saveQueueItems$1(this, cVar);
        Object obj3 = persistentPlayerQueueServiceImpl$saveQueueItems$1.result;
        i10 = persistentPlayerQueueServiceImpl$saveQueueItems$1.label;
        if (i10 == 0) {
        }
        return z.f31622a;
    }
}
