package io.elevenlabs.data.services;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import fr.g0;
import ho.p;
import ho.q;
import hr.x;
import io.elevenlabs.data.api.ReadsAPI;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntity;
import io.elevenlabs.data.database.entities.reads.ReadMetaEntityWithChapters;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import io.elevenlabs.data.database.entities.reads.SyncState;
import io.elevenlabs.data.mapping.ReadMappingKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.GetReadsChangesResponseModel;
import io.elevenlabs.data.model.response.ReadMetadataResponseModel;
import io.elevenlabs.data.services.ReadsServiceImpl;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.SyncStatus;
import io.elevenlabs.domain.services.ConnectivityService;
import io.elevenlabs.domain.services.ConnectivityServiceKt;
import ir.m1;
import ir.r;
import ir.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.a0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$sync$1", f = "ReadsServiceImpl.kt", l = {222}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhr/x;", "Lio/elevenlabs/domain/model/SyncStatus;", "Lsn/z;", "<anonymous>", "(Lhr/x;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class ReadsServiceImpl$sync$1 extends yn.i implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReadsServiceImpl this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$sync$1$1", f = "ReadsServiceImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lir/i;", "Lio/elevenlabs/domain/model/SyncStatus;", "<anonymous>", "()Lir/i;"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$sync$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.l {
        int label;
        final /* synthetic */ ReadsServiceImpl this$0;

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$sync$1$1$1", f = "ReadsServiceImpl.kt", l = {146, 149, 156, 158, 164, 169, 184, 186, 191, 193, 212}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/model/SyncStatus;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$sync$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C00141 extends yn.i implements p {
            int I$0;
            int I$1;
            int I$2;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$10;
            Object L$11;
            Object L$12;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            Object L$6;
            Object L$7;
            Object L$8;
            Object L$9;
            int label;
            final /* synthetic */ ReadsServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00141(ReadsServiceImpl readsServiceImpl, wn.c<? super C00141> cVar) {
                super(2, cVar);
                this.this$0 = readsServiceImpl;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                C00141 c00141 = new C00141(this.this$0, cVar);
                c00141.L$0 = obj;
                return c00141;
            }

            @Override // ho.p
            public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
                return ((C00141) create(jVar, cVar)).invokeSuspend(z.f31622a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:101:0x05d6, code lost:
            
                if (r1.emit(r2, r17) == r7) goto L134;
             */
            /* JADX WARN: Code restructure failed: missing block: B:135:0x0280, code lost:
            
                if (r2.flushListeningPositions(r17) == r7) goto L134;
             */
            /* JADX WARN: Code restructure failed: missing block: B:144:0x01a6, code lost:
            
                if (r2 == r7) goto L134;
             */
            /* JADX WARN: Code restructure failed: missing block: B:146:0x0182, code lost:
            
                if (r1.emit(r2, r17) == r7) goto L134;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x02bb, code lost:
            
                if (r2 == r7) goto L134;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x03d8, code lost:
            
                r3 = r8;
                r8 = r11;
                r11 = r2;
                r2 = r14;
             */
            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:100:0x05b0  */
            /* JADX WARN: Removed duplicated region for block: B:125:0x01f3  */
            /* JADX WARN: Removed duplicated region for block: B:130:0x022f  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x0256  */
            /* JADX WARN: Removed duplicated region for block: B:134:0x0267  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x04a6  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x04e5  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0520  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0526  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0287  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x03de  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x048c  */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v21, types: [int] */
            /* JADX WARN: Type inference failed for: r3v30, types: [boolean] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x024e -> B:102:0x024f). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0256 -> B:103:0x01ed). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x050f -> B:10:0x0514). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0520 -> B:11:0x04a0). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x048c -> B:11:0x04a0). Please report as a decompilation issue!!! */
            @Override // yn.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Logger logger;
                String str;
                ReadsDao readsDao;
                Object count;
                ReadsDao readsDao2;
                Logger logger2;
                String str2;
                ReadsServiceImpl readsServiceImpl;
                Iterator it;
                int i10;
                Iterator it2;
                int i11;
                int i12;
                ReadMetaEntityWithChapters readMetaEntityWithChapters;
                ReadsServiceImpl readsServiceImpl2;
                Object obj2;
                Logger logger3;
                String str3;
                Object removeMetaAndChapters;
                Iterator it3;
                ReadsAPI readsAPI;
                String str4;
                int i13;
                Object obj3;
                int i14;
                ApiResult apiResult;
                int i15;
                int i16;
                ReadMetaEntityWithChapters readMetaEntityWithChapters2;
                Iterator it4;
                List<ReadMetadataResponseModel> list;
                ReadMetaEntityWithChapters readMetaEntityWithChapters3;
                ReadsServiceImpl readsServiceImpl3;
                int i17;
                ApiResult apiResult2;
                List<ReadMetadataResponseModel> list2;
                int i18;
                Iterator it5;
                ReadsServiceImpl readsServiceImpl4;
                List<ReadMetadataResponseModel> list3;
                int i19;
                int i20;
                ApiResult apiResult3;
                Object obj4;
                Object removeCache;
                int i21;
                ReadMetadataSaver readMetadataSaver;
                Logger logger4;
                String str5;
                ReadsDao readsDao3;
                Logger logger5;
                String str6;
                SyncState syncState;
                ReadMetaEntity meta;
                ReadsAPI readsAPI2;
                long lastSyncTimestamp;
                ReadMetaEntityWithChapters readMetaEntityWithChapters4;
                int i22;
                Object removeMetaAndChapters2;
                int i23;
                Iterator it6;
                ReadsServiceImpl readsServiceImpl5;
                List<ReadMetadataResponseModel> list4;
                ApiResult apiResult4;
                Long l4;
                ReadsDao readsDao4;
                Logger logger6;
                String str7;
                ir.j jVar = (ir.j) this.L$0;
                int i24 = this.label;
                ?? r32 = 1;
                xn.a aVar = xn.a.f37986a;
                switch (i24) {
                    case 0:
                        sn.a.g(obj);
                        SyncStatus syncStatus = SyncStatus.SYNCING;
                        this.L$0 = jVar;
                        this.label = 1;
                        break;
                    case 1:
                        sn.a.g(obj);
                        logger = this.this$0.logger;
                        str = this.this$0.tag;
                        logger.log(str, "Sync started");
                        readsDao = this.this$0.readsDao;
                        this.L$0 = jVar;
                        this.label = 2;
                        count = readsDao.getCount(this);
                        break;
                    case 2:
                        sn.a.g(obj);
                        count = obj;
                        if (((Number) count).intValue() == 0) {
                            this.this$0.setLastSyncTimestamp(0L);
                        }
                        readsDao2 = this.this$0.readsDao;
                        List<ReadMetaEntityWithChapters> allWithSyncState = readsDao2.getAllWithSyncState(SyncState.PENDING_DELETE);
                        logger2 = this.this$0.logger;
                        str2 = this.this$0.tag;
                        logger2.log(str2, "Items to delete: " + allWithSyncState.size());
                        readsServiceImpl = this.this$0;
                        it = allWithSyncState.iterator();
                        i10 = 0;
                        if (!it.hasNext()) {
                            ReadMetaEntityWithChapters readMetaEntityWithChapters5 = (ReadMetaEntityWithChapters) it.next();
                            readsAPI = readsServiceImpl.readsAPI;
                            String read_id = readMetaEntityWithChapters5.getMeta().getRead_id();
                            this.L$0 = jVar;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = readsServiceImpl;
                            this.L$4 = it;
                            this.L$5 = null;
                            this.L$6 = readMetaEntityWithChapters5;
                            this.L$7 = null;
                            this.I$0 = i10;
                            this.I$1 = 0;
                            this.label = 3;
                            obj2 = readsAPI.removeRead(read_id, this);
                            if (obj2 != aVar) {
                                readMetaEntityWithChapters = readMetaEntityWithChapters5;
                                it2 = it;
                                i12 = i10;
                                readsServiceImpl2 = readsServiceImpl;
                                i11 = 0;
                                if (((ApiResult) obj2) instanceof ApiResult.Success) {
                                    logger3 = readsServiceImpl2.logger;
                                    str3 = readsServiceImpl2.tag;
                                    logger3.log(str3, "Error deleting read");
                                    readsServiceImpl = readsServiceImpl2;
                                    i10 = i12;
                                    it = it2;
                                    if (!it.hasNext()) {
                                    }
                                } else {
                                    this.L$0 = jVar;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = readsServiceImpl2;
                                    this.L$4 = it2;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = null;
                                    this.I$0 = i12;
                                    this.I$1 = i11;
                                    this.label = 4;
                                    removeMetaAndChapters = readsServiceImpl2.removeMetaAndChapters(readMetaEntityWithChapters, this);
                                    if (removeMetaAndChapters != aVar) {
                                        it3 = it2;
                                        ReadsServiceImpl readsServiceImpl6 = readsServiceImpl2;
                                        i10 = i12;
                                        it = it3;
                                        readsServiceImpl = readsServiceImpl6;
                                        if (!it.hasNext()) {
                                            ReadsServiceImpl readsServiceImpl7 = this.this$0;
                                            this.L$0 = jVar;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.L$7 = null;
                                            this.label = 5;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        return aVar;
                    case 3:
                        int i25 = this.I$1;
                        int i26 = this.I$0;
                        ReadMetaEntityWithChapters readMetaEntityWithChapters6 = (ReadMetaEntityWithChapters) this.L$6;
                        it2 = (Iterator) this.L$4;
                        ReadsServiceImpl readsServiceImpl8 = (ReadsServiceImpl) this.L$3;
                        sn.a.g(obj);
                        i11 = i25;
                        i12 = i26;
                        readMetaEntityWithChapters = readMetaEntityWithChapters6;
                        readsServiceImpl2 = readsServiceImpl8;
                        obj2 = obj;
                        if (((ApiResult) obj2) instanceof ApiResult.Success) {
                        }
                        break;
                    case 4:
                        i12 = this.I$0;
                        it3 = (Iterator) this.L$4;
                        readsServiceImpl2 = (ReadsServiceImpl) this.L$3;
                        sn.a.g(obj);
                        ReadsServiceImpl readsServiceImpl62 = readsServiceImpl2;
                        i10 = i12;
                        it = it3;
                        readsServiceImpl = readsServiceImpl62;
                        if (!it.hasNext()) {
                        }
                        return aVar;
                    case 5:
                        sn.a.g(obj);
                        str4 = null;
                        if (r32 == 0) {
                            readsAPI2 = this.this$0.readsAPI;
                            lastSyncTimestamp = this.this$0.getLastSyncTimestamp();
                            Long l7 = new Long(lastSyncTimestamp);
                            this.L$0 = jVar;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.L$9 = null;
                            this.L$10 = null;
                            this.L$11 = null;
                            this.L$12 = null;
                            this.I$0 = r32;
                            this.label = 6;
                            obj3 = readsAPI2.getChanges(str4, l7, this);
                            i13 = r32;
                            break;
                        } else {
                            SyncStatus syncStatus2 = SyncStatus.READY;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.L$9 = null;
                            this.L$10 = null;
                            this.L$11 = null;
                            this.L$12 = null;
                            this.I$0 = r32;
                            this.label = 11;
                            break;
                        }
                        return aVar;
                    case 6:
                        int i27 = this.I$0;
                        sn.a.g(obj);
                        i13 = i27;
                        obj3 = obj;
                        apiResult2 = (ApiResult) obj3;
                        if (apiResult2 instanceof ApiResult.Success) {
                            list2 = ((GetReadsChangesResponseModel) ((ApiResult.Success) apiResult2).getData()).getReads();
                            ArrayList arrayList = new ArrayList(tn.p.a0(list2, 10));
                            Iterator it7 = list2.iterator();
                            while (it7.hasNext()) {
                                arrayList.add(((ReadMetadataResponseModel) it7.next()).getReadId());
                            }
                            readsDao3 = this.this$0.readsDao;
                            List<ReadMetaEntityWithChapters> allById = readsDao3.getAllById(arrayList);
                            int H = a0.H(tn.p.a0(allById, 10));
                            if (H < 16) {
                                H = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(H);
                            for (Object obj5 : allById) {
                                linkedHashMap.put(((ReadMetaEntityWithChapters) obj5).getMeta().getRead_id(), obj5);
                            }
                            ArrayList arrayList2 = new ArrayList(tn.p.a0(list2, 10));
                            for (ReadMetadataResponseModel readMetadataResponseModel : list2) {
                                arrayList2.add(new sn.k(ReadMappingKt.toEntity(readMetadataResponseModel), linkedHashMap.get(readMetadataResponseModel.getReadId())));
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj6 : arrayList2) {
                                sn.k kVar = (sn.k) obj6;
                                if (!m.c((ReadMetaEntityWithChapters) kVar.f31600a, (ReadMetaEntityWithChapters) kVar.f31601b)) {
                                    arrayList3.add(obj6);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj7 : arrayList3) {
                                ReadMetaEntityWithChapters readMetaEntityWithChapters7 = (ReadMetaEntityWithChapters) ((sn.k) obj7).f31601b;
                                if (readMetaEntityWithChapters7 != null && (meta = readMetaEntityWithChapters7.getMeta()) != null) {
                                    syncState = meta.getSync_state();
                                } else {
                                    syncState = null;
                                }
                                if (syncState != SyncState.PENDING_UPDATE_PUSH) {
                                    arrayList4.add(obj7);
                                }
                            }
                            ReadsServiceImpl readsServiceImpl9 = this.this$0;
                            logger5 = readsServiceImpl9.logger;
                            str6 = readsServiceImpl9.tag;
                            logger5.log(str6, "New or updated items: " + arrayList4.size());
                            readsServiceImpl3 = this.this$0;
                            it4 = arrayList4.iterator();
                            i17 = 0;
                            if (!it4.hasNext()) {
                                sn.k kVar2 = (sn.k) it4.next();
                                readMetaEntityWithChapters3 = (ReadMetaEntityWithChapters) kVar2.f31600a;
                                readMetaEntityWithChapters2 = (ReadMetaEntityWithChapters) kVar2.f31601b;
                                readMetadataSaver = readsServiceImpl3.readMetadataSaver;
                                this.L$0 = jVar;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = apiResult2;
                                this.L$4 = list2;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = readsServiceImpl3;
                                this.L$9 = it4;
                                this.L$10 = null;
                                this.L$11 = readMetaEntityWithChapters3;
                                this.L$12 = readMetaEntityWithChapters2;
                                this.I$0 = i13 == true ? 1 : 0;
                                this.I$1 = i17;
                                this.I$2 = 0;
                                this.label = 7;
                                if (readMetadataSaver.saveMetaAndChapters(readMetaEntityWithChapters3, this) != aVar) {
                                    apiResult = apiResult2;
                                    i16 = i17;
                                    list = list2;
                                    i14 = i13 == true ? 1 : 0;
                                    i15 = 0;
                                    if (readMetaEntityWithChapters2 == null && !m.c(readMetaEntityWithChapters3.getMeta().getHtml_checksum(), readMetaEntityWithChapters2.getMeta().getHtml_checksum())) {
                                        String read_id2 = readMetaEntityWithChapters2.getMeta().getRead_id();
                                        String html_checksum = readMetaEntityWithChapters2.getMeta().getHtml_checksum();
                                        this.L$0 = jVar;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = apiResult;
                                        this.L$4 = list;
                                        this.L$5 = null;
                                        this.L$6 = null;
                                        this.L$7 = null;
                                        this.L$8 = readsServiceImpl3;
                                        this.L$9 = it4;
                                        this.L$10 = null;
                                        this.L$11 = null;
                                        this.L$12 = null;
                                        this.I$0 = i14;
                                        this.I$1 = i16;
                                        this.I$2 = i15;
                                        this.label = 8;
                                        removeCache = readsServiceImpl3.removeCache(read_id2, html_checksum, this);
                                        if (removeCache != aVar) {
                                            i13 = i14;
                                            Iterator it8 = it4;
                                            ReadsServiceImpl readsServiceImpl10 = readsServiceImpl3;
                                            List<ReadMetadataResponseModel> list5 = list;
                                            i17 = i16;
                                            apiResult2 = apiResult;
                                            it4 = it8;
                                            list2 = list5;
                                            readsServiceImpl3 = readsServiceImpl10;
                                        }
                                    } else {
                                        i13 = i14;
                                        list2 = list;
                                        i17 = i16;
                                        apiResult2 = apiResult;
                                    }
                                    if (!it4.hasNext()) {
                                        List<String> deletedReadIds = ((GetReadsChangesResponseModel) ((ApiResult.Success) apiResult2).getData()).getDeletedReadIds();
                                        readsServiceImpl4 = this.this$0;
                                        it5 = deletedReadIds.iterator();
                                        i21 = 0;
                                        i22 = i13;
                                        if (!it5.hasNext()) {
                                            String str8 = (String) it5.next();
                                            readsDao4 = readsServiceImpl4.readsDao;
                                            this.L$0 = jVar;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = apiResult2;
                                            this.L$4 = list2;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.L$7 = null;
                                            this.L$8 = readsServiceImpl4;
                                            this.L$9 = it5;
                                            this.L$10 = null;
                                            this.L$11 = null;
                                            this.L$12 = null;
                                            this.I$0 = i22;
                                            this.I$1 = i21;
                                            this.I$2 = 0;
                                            this.label = 9;
                                            obj4 = readsDao4.getById(str8, this);
                                            if (obj4 != aVar) {
                                                apiResult3 = apiResult2;
                                                i20 = i21;
                                                list3 = list2;
                                                i18 = i22;
                                                i19 = 0;
                                                readMetaEntityWithChapters4 = (ReadMetaEntityWithChapters) obj4;
                                                if (readMetaEntityWithChapters4 == null) {
                                                    this.L$0 = jVar;
                                                    this.L$1 = null;
                                                    this.L$2 = null;
                                                    this.L$3 = apiResult3;
                                                    this.L$4 = list3;
                                                    this.L$5 = null;
                                                    this.L$6 = null;
                                                    this.L$7 = null;
                                                    this.L$8 = readsServiceImpl4;
                                                    this.L$9 = it5;
                                                    this.L$10 = null;
                                                    this.L$11 = null;
                                                    this.L$12 = null;
                                                    this.I$0 = i18;
                                                    this.I$1 = i20;
                                                    this.I$2 = i19;
                                                    this.label = 10;
                                                    removeMetaAndChapters2 = readsServiceImpl4.removeMetaAndChapters(readMetaEntityWithChapters4, this);
                                                    if (removeMetaAndChapters2 != aVar) {
                                                        i23 = i18;
                                                        it6 = it5;
                                                        readsServiceImpl5 = readsServiceImpl4;
                                                        list4 = list3;
                                                        apiResult4 = apiResult3;
                                                        ApiResult apiResult5 = apiResult4;
                                                        i21 = i20;
                                                        apiResult2 = apiResult5;
                                                        ReadsServiceImpl readsServiceImpl11 = readsServiceImpl5;
                                                        it5 = it6;
                                                        list2 = list4;
                                                        readsServiceImpl4 = readsServiceImpl11;
                                                        i22 = i23;
                                                        if (!it5.hasNext()) {
                                                            ApiResult.Success success = (ApiResult.Success) apiResult2;
                                                            r32 = ((GetReadsChangesResponseModel) success.getData()).getHasMore();
                                                            str4 = ((GetReadsChangesResponseModel) success.getData()).getLastSortId();
                                                            Iterator it9 = list2.iterator();
                                                            if (!it9.hasNext()) {
                                                                l4 = null;
                                                            } else {
                                                                l4 = new Long(((ReadMetadataResponseModel) it9.next()).getUpdatedAtUnix());
                                                                while (it9.hasNext()) {
                                                                    Long l10 = new Long(((ReadMetadataResponseModel) it9.next()).getUpdatedAtUnix());
                                                                    if (l4.compareTo(l10) < 0) {
                                                                        l4 = l10;
                                                                    }
                                                                }
                                                            }
                                                            if (l4 != null) {
                                                                this.this$0.setLastSyncTimestamp(l4.longValue());
                                                            }
                                                            if (r32 == 0) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i22 = i18;
                                                    list2 = list3;
                                                    i21 = i20;
                                                    apiResult2 = apiResult3;
                                                    if (!it5.hasNext()) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return aVar;
                            }
                        } else {
                            if (apiResult2 instanceof ApiResult.Error) {
                                logger4 = this.this$0.logger;
                                str5 = this.this$0.tag;
                                Logger.logWarning$default(logger4, str5, "Error during sync: " + apiResult2, null, 4, null);
                                throw new ReadsServiceImpl.ReadsSyncException();
                            }
                            c6.p();
                            return null;
                        }
                        break;
                    case 7:
                        int i28 = this.I$2;
                        int i29 = this.I$1;
                        i14 = this.I$0;
                        ReadMetaEntityWithChapters readMetaEntityWithChapters8 = (ReadMetaEntityWithChapters) this.L$12;
                        ReadMetaEntityWithChapters readMetaEntityWithChapters9 = (ReadMetaEntityWithChapters) this.L$11;
                        Iterator it10 = (Iterator) this.L$9;
                        ReadsServiceImpl readsServiceImpl12 = (ReadsServiceImpl) this.L$8;
                        List<ReadMetadataResponseModel> list6 = (List) this.L$4;
                        apiResult = (ApiResult) this.L$3;
                        sn.a.g(obj);
                        i15 = i28;
                        i16 = i29;
                        readMetaEntityWithChapters2 = readMetaEntityWithChapters8;
                        it4 = it10;
                        list = list6;
                        readMetaEntityWithChapters3 = readMetaEntityWithChapters9;
                        readsServiceImpl3 = readsServiceImpl12;
                        if (readMetaEntityWithChapters2 == null) {
                            break;
                        }
                        i13 = i14;
                        list2 = list;
                        i17 = i16;
                        apiResult2 = apiResult;
                        if (!it4.hasNext()) {
                        }
                        break;
                    case 8:
                        int i30 = this.I$1;
                        i13 = this.I$0;
                        Iterator it11 = (Iterator) this.L$9;
                        ReadsServiceImpl readsServiceImpl13 = (ReadsServiceImpl) this.L$8;
                        List<ReadMetadataResponseModel> list7 = (List) this.L$4;
                        ApiResult apiResult6 = (ApiResult) this.L$3;
                        sn.a.g(obj);
                        i17 = i30;
                        apiResult2 = apiResult6;
                        it4 = it11;
                        list2 = list7;
                        readsServiceImpl3 = readsServiceImpl13;
                        if (!it4.hasNext()) {
                        }
                        break;
                    case 9:
                        int i31 = this.I$2;
                        int i32 = this.I$1;
                        i18 = this.I$0;
                        it5 = (Iterator) this.L$9;
                        readsServiceImpl4 = (ReadsServiceImpl) this.L$8;
                        list3 = (List) this.L$4;
                        ApiResult apiResult7 = (ApiResult) this.L$3;
                        sn.a.g(obj);
                        i19 = i31;
                        i20 = i32;
                        apiResult3 = apiResult7;
                        obj4 = obj;
                        readMetaEntityWithChapters4 = (ReadMetaEntityWithChapters) obj4;
                        if (readMetaEntityWithChapters4 == null) {
                        }
                        break;
                    case 10:
                        i20 = this.I$1;
                        int i33 = this.I$0;
                        it6 = (Iterator) this.L$9;
                        readsServiceImpl5 = (ReadsServiceImpl) this.L$8;
                        list4 = (List) this.L$4;
                        apiResult4 = (ApiResult) this.L$3;
                        sn.a.g(obj);
                        i23 = i33;
                        ApiResult apiResult52 = apiResult4;
                        i21 = i20;
                        apiResult2 = apiResult52;
                        ReadsServiceImpl readsServiceImpl112 = readsServiceImpl5;
                        it5 = it6;
                        list2 = list4;
                        readsServiceImpl4 = readsServiceImpl112;
                        i22 = i23;
                        if (!it5.hasNext()) {
                        }
                        break;
                    case 11:
                        sn.a.g(obj);
                        logger6 = this.this$0.logger;
                        str7 = this.this$0.tag;
                        logger6.log(str7, "Sync completed successfully");
                        return z.f31622a;
                    default:
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$sync$1$1$2", f = "ReadsServiceImpl.kt", l = {216}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", ParameterNames.CAUSE, ""}, k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$sync$1$1$2, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass2 extends yn.i implements p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ReadsServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ReadsServiceImpl readsServiceImpl, wn.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.this$0 = readsServiceImpl;
            }

            @Override // yn.a
            public final wn.c<z> create(Object obj, wn.c<?> cVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, cVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // ho.p
            public final Object invoke(Throwable th, wn.c<? super Boolean> cVar) {
                return ((AnonymousClass2) create(th, cVar)).invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                Logger logger;
                String str;
                Throwable th = (Throwable) this.L$0;
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    logger = this.this$0.logger;
                    str = this.this$0.tag;
                    Logger.logWarning$default(logger, str, defpackage.f.i("Sync failed, will retry: ", th.getMessage()), null, 4, null);
                    xq.a aVar = xq.b.f38124b;
                    long n2 = xq.g.n(4, xq.d.SECONDS);
                    this.L$0 = null;
                    this.label = 1;
                    Object n10 = g0.n(n2, this);
                    xn.a aVar2 = xn.a.f37986a;
                    if (n10 == aVar2) {
                        return aVar2;
                    }
                }
                return Boolean.TRUE;
            }
        }

        /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
        @yn.e(c = "io.elevenlabs.data.services.ReadsServiceImpl$sync$1$1$3", f = "ReadsServiceImpl.kt", l = {220}, m = "invokeSuspend", v = 2)
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/model/SyncStatus;", "", "it", "Lsn/z;", "<anonymous>", "(Lir/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
        /* renamed from: io.elevenlabs.data.services.ReadsServiceImpl$sync$1$1$3, reason: invalid class name */
        /* loaded from: classes3.dex */
        public static final class AnonymousClass3 extends yn.i implements q {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ReadsServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ReadsServiceImpl readsServiceImpl, wn.c<? super AnonymousClass3> cVar) {
                super(3, cVar);
                this.this$0 = readsServiceImpl;
            }

            @Override // ho.q
            public final Object invoke(ir.j jVar, Throwable th, wn.c<? super z> cVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, cVar);
                anonymousClass3.L$0 = jVar;
                return anonymousClass3.invokeSuspend(z.f31622a);
            }

            @Override // yn.a
            public final Object invokeSuspend(Object obj) {
                Logger logger;
                String str;
                ir.j jVar = (ir.j) this.L$0;
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    logger = this.this$0.logger;
                    str = this.this$0.tag;
                    logger.log(str, "Sync failed after all retries");
                    SyncStatus syncStatus = SyncStatus.ERROR;
                    this.L$0 = null;
                    this.label = 1;
                    Object emit = jVar.emit(syncStatus, this);
                    xn.a aVar = xn.a.f37986a;
                    if (emit == aVar) {
                        return aVar;
                    }
                }
                return z.f31622a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReadsServiceImpl readsServiceImpl, wn.c<? super AnonymousClass1> cVar) {
            super(1, cVar);
            this.this$0 = readsServiceImpl;
        }

        @Override // yn.a
        public final wn.c<z> create(wn.c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        @Override // ho.l
        public final Object invoke(wn.c<? super ir.i> cVar) {
            return ((AnonymousClass1) create(cVar)).invokeSuspend(z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                sn.a.g(obj);
                return new w(r.C(new m1(new C00141(this.this$0, null)), new AnonymousClass2(this.this$0, null)), new AnonymousClass3(this.this$0, null));
            }
            c6.x("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadsServiceImpl$sync$1(ReadsServiceImpl readsServiceImpl, wn.c<? super ReadsServiceImpl$sync$1> cVar) {
        super(2, cVar);
        this.this$0 = readsServiceImpl;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        ReadsServiceImpl$sync$1 readsServiceImpl$sync$1 = new ReadsServiceImpl$sync$1(this.this$0, cVar);
        readsServiceImpl$sync$1.L$0 = obj;
        return readsServiceImpl$sync$1;
    }

    @Override // ho.p
    public final Object invoke(x xVar, wn.c<? super z> cVar) {
        return ((ReadsServiceImpl$sync$1) create(xVar, cVar)).invokeSuspend(z.f31622a);
    }

    @Override // yn.a
    public final Object invokeSuspend(Object obj) {
        ConnectivityService connectivityService;
        final x xVar = (x) this.L$0;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            connectivityService = this.this$0.connectivityService;
            ir.i whenConnected = ConnectivityServiceKt.whenConnected(connectivityService, new AnonymousClass1(this.this$0, null));
            ir.j jVar = new ir.j() { // from class: io.elevenlabs.data.services.ReadsServiceImpl$sync$1.2
                public final Object emit(SyncStatus syncStatus, wn.c<? super z> cVar) {
                    Object c5 = ((hr.w) x.this).f12593d.c(syncStatus, cVar);
                    if (c5 == xn.a.f37986a) {
                        return c5;
                    }
                    return z.f31622a;
                }

                @Override // ir.j
                public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                    return emit((SyncStatus) obj2, (wn.c<? super z>) cVar);
                }
            };
            this.L$0 = null;
            this.label = 1;
            Object collect = whenConnected.collect(jVar, this);
            xn.a aVar = xn.a.f37986a;
            if (collect == aVar) {
                return aVar;
            }
        }
        return z.f31622a;
    }
}
