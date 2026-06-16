package io.elevenlabs.data.services;

import com.google.protobuf.c6;
import ho.p;
import io.elevenlabs.data.api.RecentVoicesApi;
import io.elevenlabs.data.database.entities.voices.RecentVoicesDao;
import io.elevenlabs.data.mapping.VoiceMappingKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.ReaderVoicesResponseModel;
import io.elevenlabs.data.model.response.VoiceItemResponseModel;
import io.elevenlabs.data.services.RecentVoicesServiceImpl;
import io.elevenlabs.data.usecase.CurrentTimeMillisUseCase;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.SyncStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.data.services.RecentVoicesServiceImpl$syncRecentVoices$1", f = "RecentVoicesServiceImpl.kt", l = {38, 41, 50, 52}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lir/j;", "Lio/elevenlabs/domain/model/SyncStatus;", "Lsn/z;", "<anonymous>", "(Lir/j;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes3.dex */
public final class RecentVoicesServiceImpl$syncRecentVoices$1 extends yn.i implements p {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RecentVoicesServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentVoicesServiceImpl$syncRecentVoices$1(RecentVoicesServiceImpl recentVoicesServiceImpl, wn.c<? super RecentVoicesServiceImpl$syncRecentVoices$1> cVar) {
        super(2, cVar);
        this.this$0 = recentVoicesServiceImpl;
    }

    @Override // yn.a
    public final wn.c<z> create(Object obj, wn.c<?> cVar) {
        RecentVoicesServiceImpl$syncRecentVoices$1 recentVoicesServiceImpl$syncRecentVoices$1 = new RecentVoicesServiceImpl$syncRecentVoices$1(this.this$0, cVar);
        recentVoicesServiceImpl$syncRecentVoices$1.L$0 = obj;
        return recentVoicesServiceImpl$syncRecentVoices$1;
    }

    @Override // ho.p
    public final Object invoke(ir.j jVar, wn.c<? super z> cVar) {
        return ((RecentVoicesServiceImpl$syncRecentVoices$1) create(jVar, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d1, code lost:
    
        if (r0.emit(r10, r9) == r8) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d3, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        if (r10.insertAll(r1, r5, r9) == r8) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r10 == r8) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r0.emit(r10, r9) == r8) goto L31;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        RecentVoicesApi recentVoicesApi;
        Logger logger2;
        RecentVoicesDao recentVoicesDao;
        CurrentTimeMillisUseCase currentTimeMillisUseCase;
        Logger logger3;
        ir.j jVar = (ir.j) this.L$0;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            sn.a.g(obj);
                            logger3 = this.this$0.logger;
                            logger3.log("RecentVoicesService", "Voices sync completed successfully");
                            return z.f31622a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                    SyncStatus syncStatus = SyncStatus.READY;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                } else {
                    sn.a.g(obj);
                    ApiResult apiResult = (ApiResult) obj;
                    if (!(apiResult instanceof ApiResult.Success)) {
                        logger2 = this.this$0.logger;
                        Logger.logWarning$default(logger2, "RecentVoicesService", "Error during recent voices sync: " + apiResult, null, 4, null);
                        throw new RecentVoicesServiceImpl.RecentVoicesSyncException();
                    }
                    List<VoiceItemResponseModel> voices = ((ReaderVoicesResponseModel) ((ApiResult.Success) apiResult).getData()).getVoices();
                    ArrayList arrayList = new ArrayList(tn.p.a0(voices, 10));
                    Iterator<T> it = voices.iterator();
                    while (it.hasNext()) {
                        arrayList.add(VoiceMappingKt.toEntity((VoiceItemResponseModel) it.next()));
                    }
                    recentVoicesDao = this.this$0.dao;
                    currentTimeMillisUseCase = this.this$0.currentTimeMillisUseCase;
                    long invoke = currentTimeMillisUseCase.invoke();
                    this.L$0 = jVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                }
            } else {
                sn.a.g(obj);
            }
        } else {
            sn.a.g(obj);
            SyncStatus syncStatus2 = SyncStatus.SYNCING;
            this.L$0 = jVar;
            this.label = 1;
        }
        logger = this.this$0.logger;
        logger.log("RecentVoicesService", "Recent voices sync started");
        recentVoicesApi = this.this$0.api;
        this.L$0 = jVar;
        this.label = 2;
        obj = RecentVoicesApi.getRecentlyUsedVoices$default(recentVoicesApi, null, this, 1, null);
    }
}
