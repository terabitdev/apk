package io.elevenlabs.data.services;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.protobuf.c6;
import io.elevenlabs.data.api.ConsumptionAPI;
import io.elevenlabs.data.database.entities.consumption.ConsumptionSpanDao;
import io.elevenlabs.data.database.entities.consumption.ConsumptionSpanEntity;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.request.ConsumptionSpanRequest;
import io.elevenlabs.data.model.request.ConsumptionSyncRequest;
import io.elevenlabs.data.model.response.ConsumptionSyncResponse;
import io.elevenlabs.data.worker.SyncConsumptionSpansWorker;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AudioType;
import io.elevenlabs.domain.model.ConsumptionSpan;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.services.ConsumptionTrackingService;
import io.elevenlabs.domain.services.ReadsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.o;
import tn.p;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010%\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/elevenlabs/data/services/ConsumptionRepository;", "Lio/elevenlabs/domain/services/ConsumptionTrackingService;", "Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanDao;", "consumptionSpanDao", "Lio/elevenlabs/data/api/ConsumptionAPI;", "consumptionAPI", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Analytics;", "analytics", "Ljl/a;", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Landroid/content/Context;", "appContext", "<init>", "(Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanDao;Lio/elevenlabs/data/api/ConsumptionAPI;Lio/elevenlabs/domain/Logger;Lio/elevenlabs/domain/Analytics;Ljl/a;Landroid/content/Context;)V", "", "readId", "", "Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanEntity;", "spans", "Lsn/z;", "syncSpansForRead", "(Ljava/lang/String;Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/ConsumptionSpan;", "span", "saveSpan", "(Lio/elevenlabs/domain/model/ConsumptionSpan;Lwn/c;)Ljava/lang/Object;", "syncSpans", "(Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanDao;", "Lio/elevenlabs/data/api/ConsumptionAPI;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/domain/Analytics;", "Ljl/a;", "Landroid/content/Context;", ParameterNames.TAG, "Ljava/lang/String;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConsumptionRepository implements ConsumptionTrackingService {
    private final Analytics analytics;
    private final Context appContext;
    private final ConsumptionAPI consumptionAPI;
    private final ConsumptionSpanDao consumptionSpanDao;
    private final Logger logger;
    private final jl.a readsService;
    private final String tag;

    public ConsumptionRepository(ConsumptionSpanDao consumptionSpanDao, ConsumptionAPI consumptionAPI, Logger logger, Analytics analytics, jl.a aVar, Context context) {
        consumptionSpanDao.getClass();
        consumptionAPI.getClass();
        logger.getClass();
        analytics.getClass();
        aVar.getClass();
        context.getClass();
        this.consumptionSpanDao = consumptionSpanDao;
        this.consumptionAPI = consumptionAPI;
        this.logger = logger;
        this.analytics = analytics;
        this.readsService = aVar;
        this.appContext = context;
        this.tag = "ConsumptionRepository";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0308 -> B:12:0x0309). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncSpansForRead(String str, List<ConsumptionSpanEntity> list, wn.c<? super z> cVar) {
        ConsumptionRepository$syncSpansForRead$1 consumptionRepository$syncSpansForRead$1;
        int i10;
        ConsumptionRepository$syncSpansForRead$1 consumptionRepository$syncSpansForRead$12;
        Iterator it;
        String str2;
        xn.a aVar;
        String str3;
        String str4;
        Iterator it2;
        boolean z6;
        ConsumptionRepository$syncSpansForRead$1 consumptionRepository$syncSpansForRead$13;
        List list2;
        ApiResult apiResult;
        String str5;
        char c5;
        char c10;
        int i11;
        if (cVar instanceof ConsumptionRepository$syncSpansForRead$1) {
            consumptionRepository$syncSpansForRead$1 = (ConsumptionRepository$syncSpansForRead$1) cVar;
            int i12 = consumptionRepository$syncSpansForRead$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                consumptionRepository$syncSpansForRead$1.label = i12 - Integer.MIN_VALUE;
                Object obj = consumptionRepository$syncSpansForRead$1.result;
                i10 = consumptionRepository$syncSpansForRead$1.label;
                String str6 = " spans for read ";
                int i13 = 10;
                xn.a aVar2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                Iterator it3 = (Iterator) consumptionRepository$syncSpansForRead$1.L$2;
                                String str7 = (String) consumptionRepository$syncSpansForRead$1.L$0;
                                sn.a.g(obj);
                                str5 = " spans for read ";
                                c10 = 3;
                                z6 = true;
                                str2 = str7;
                                consumptionRepository$syncSpansForRead$13 = consumptionRepository$syncSpansForRead$1;
                                i11 = 10;
                                aVar = aVar2;
                                c5 = 2;
                                it2 = it3;
                                aVar2 = aVar;
                                consumptionRepository$syncSpansForRead$12 = consumptionRepository$syncSpansForRead$13;
                                it = it2;
                                str6 = str5;
                                i13 = i11;
                            } else {
                                c6.x("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            Iterator it4 = (Iterator) consumptionRepository$syncSpansForRead$1.L$2;
                            String str8 = (String) consumptionRepository$syncSpansForRead$1.L$0;
                            sn.a.g(obj);
                            str2 = str8;
                            ConsumptionRepository$syncSpansForRead$1 consumptionRepository$syncSpansForRead$14 = consumptionRepository$syncSpansForRead$1;
                            aVar2 = aVar2;
                            it = it4;
                            consumptionRepository$syncSpansForRead$12 = consumptionRepository$syncSpansForRead$14;
                            str6 = " spans for read ";
                            i13 = 10;
                        }
                    } else {
                        list2 = (List) consumptionRepository$syncSpansForRead$1.L$3;
                        Iterator it5 = (Iterator) consumptionRepository$syncSpansForRead$1.L$2;
                        str4 = (String) consumptionRepository$syncSpansForRead$1.L$0;
                        sn.a.g(obj);
                        str3 = " spans for read ";
                        z6 = true;
                        it2 = it5;
                        consumptionRepository$syncSpansForRead$13 = consumptionRepository$syncSpansForRead$1;
                        aVar = aVar2;
                        apiResult = (ApiResult) obj;
                        if (!(apiResult instanceof ApiResult.Success)) {
                            Logger logger = this.logger;
                            String str9 = this.tag;
                            int size = list2.size();
                            int spansRecorded = ((ConsumptionSyncResponse) ((ApiResult.Success) apiResult).getData()).getSpansRecorded();
                            StringBuilder sb = new StringBuilder("Synced ");
                            sb.append(size);
                            String str10 = str3;
                            sb.append(str10);
                            sb.append(str4);
                            sb.append(" (recorded=");
                            sb.append(spansRecorded);
                            sb.append(Separators.RPAREN);
                            logger.log(str9, sb.toString());
                            ConsumptionSpanDao consumptionSpanDao = this.consumptionSpanDao;
                            ArrayList arrayList = new ArrayList(p.a0(list2, 10));
                            Iterator it6 = list2.iterator();
                            while (it6.hasNext()) {
                                arrayList.add(((ConsumptionSpanEntity) it6.next()).getId());
                            }
                            consumptionRepository$syncSpansForRead$13.L$0 = str4;
                            consumptionRepository$syncSpansForRead$13.L$1 = null;
                            consumptionRepository$syncSpansForRead$13.L$2 = it2;
                            consumptionRepository$syncSpansForRead$13.L$3 = null;
                            consumptionRepository$syncSpansForRead$13.L$4 = null;
                            consumptionRepository$syncSpansForRead$13.L$5 = null;
                            consumptionRepository$syncSpansForRead$13.L$6 = null;
                            consumptionRepository$syncSpansForRead$13.label = 2;
                            if (consumptionSpanDao.deleteByIds(arrayList, consumptionRepository$syncSpansForRead$13) != aVar) {
                                str2 = str4;
                                aVar2 = aVar;
                                it = it2;
                                consumptionRepository$syncSpansForRead$12 = consumptionRepository$syncSpansForRead$13;
                                str6 = str10;
                                i13 = 10;
                            }
                        } else {
                            str5 = str3;
                            c5 = 2;
                            if (apiResult instanceof ApiResult.Error.ApiError) {
                                int httpStatus = ((ApiResult.Error.ApiError) apiResult).getHttpStatus();
                                if (500 <= httpStatus && httpStatus < 600) {
                                    Logger.logWarning$default(this.logger, this.tag, "Server error syncing spans for read " + str4 + " (will retry): " + apiResult, null, 4, null);
                                    c10 = 3;
                                    aVar2 = aVar;
                                    consumptionRepository$syncSpansForRead$12 = consumptionRepository$syncSpansForRead$13;
                                    it = it2;
                                    str6 = str5;
                                    i13 = 10;
                                    str2 = str4;
                                } else {
                                    Logger.logWarning$default(this.logger, this.tag, "Permanently rejected spans for read " + str4 + ": " + apiResult, null, 4, null);
                                    ConsumptionSpanDao consumptionSpanDao2 = this.consumptionSpanDao;
                                    i11 = 10;
                                    ArrayList arrayList2 = new ArrayList(p.a0(list2, 10));
                                    Iterator it7 = list2.iterator();
                                    while (it7.hasNext()) {
                                        arrayList2.add(((ConsumptionSpanEntity) it7.next()).getId());
                                    }
                                    consumptionRepository$syncSpansForRead$13.L$0 = str4;
                                    consumptionRepository$syncSpansForRead$13.L$1 = null;
                                    consumptionRepository$syncSpansForRead$13.L$2 = it2;
                                    consumptionRepository$syncSpansForRead$13.L$3 = null;
                                    consumptionRepository$syncSpansForRead$13.L$4 = null;
                                    consumptionRepository$syncSpansForRead$13.L$5 = null;
                                    consumptionRepository$syncSpansForRead$13.L$6 = null;
                                    c10 = 3;
                                    consumptionRepository$syncSpansForRead$13.label = 3;
                                    if (consumptionSpanDao2.deleteByIds(arrayList2, consumptionRepository$syncSpansForRead$13) != aVar) {
                                        str2 = str4;
                                        aVar2 = aVar;
                                        consumptionRepository$syncSpansForRead$12 = consumptionRepository$syncSpansForRead$13;
                                        it = it2;
                                        str6 = str5;
                                        i13 = i11;
                                    }
                                }
                            } else {
                                c10 = 3;
                                if (!(apiResult instanceof ApiResult.Error.NetworkError) && !(apiResult instanceof ApiResult.Error.UnknownError)) {
                                    c6.p();
                                    return null;
                                }
                                Logger.logWarning$default(this.logger, this.tag, "Transient error syncing spans for read " + str4 + ": " + apiResult, null, 4, null);
                                aVar2 = aVar;
                                consumptionRepository$syncSpansForRead$12 = consumptionRepository$syncSpansForRead$13;
                                it = it2;
                                str6 = str5;
                                i13 = 10;
                                str2 = str4;
                            }
                        }
                        return aVar;
                    }
                } else {
                    sn.a.g(obj);
                    consumptionRepository$syncSpansForRead$12 = consumptionRepository$syncSpansForRead$1;
                    it = o.l0(list, 50).iterator();
                    str2 = str;
                }
                if (!it.hasNext()) {
                    List list3 = (List) it.next();
                    ArrayList arrayList3 = new ArrayList(p.a0(list3, i13));
                    Iterator it8 = list3.iterator();
                    while (it8.hasNext()) {
                        arrayList3.add(ConsumptionRepositoryKt.access$toApiModel((ConsumptionSpanEntity) it8.next()));
                    }
                    this.logger.log(this.tag, "Syncing " + arrayList3.size() + str6 + str2 + ":");
                    Iterator it9 = arrayList3.iterator();
                    while (it9.hasNext()) {
                        ConsumptionSpanRequest consumptionSpanRequest = (ConsumptionSpanRequest) it9.next();
                        Iterator it10 = it9;
                        String str11 = str6;
                        List list4 = list3;
                        this.logger.log(this.tag, "  file=" + consumptionSpanRequest.getAudioFileNumber() + Separators.SP + consumptionSpanRequest.getStartSeconds() + "s-" + consumptionSpanRequest.getEndSeconds() + "s speed=" + consumptionSpanRequest.getPlaybackSpeed() + " realTime=" + consumptionSpanRequest.getRealTimeDurationSeconds() + "s source=" + consumptionSpanRequest.getPlaybackSource() + " online=" + consumptionSpanRequest.getDeviceOnline());
                        it9 = it10;
                        it = it;
                        aVar2 = aVar2;
                        str6 = str11;
                        list3 = list4;
                        str2 = str2;
                    }
                    String str12 = str2;
                    Iterator it11 = it;
                    str3 = str6;
                    ConsumptionSyncRequest consumptionSyncRequest = new ConsumptionSyncRequest(arrayList3);
                    ConsumptionAPI consumptionAPI = this.consumptionAPI;
                    consumptionRepository$syncSpansForRead$12.L$0 = str12;
                    consumptionRepository$syncSpansForRead$12.L$1 = null;
                    it2 = it11;
                    consumptionRepository$syncSpansForRead$12.L$2 = it2;
                    consumptionRepository$syncSpansForRead$12.L$3 = list3;
                    consumptionRepository$syncSpansForRead$12.L$4 = null;
                    consumptionRepository$syncSpansForRead$12.L$5 = null;
                    consumptionRepository$syncSpansForRead$12.L$6 = null;
                    z6 = true;
                    consumptionRepository$syncSpansForRead$12.label = 1;
                    obj = consumptionAPI.trackConsumption(str12, consumptionSyncRequest, consumptionRepository$syncSpansForRead$12);
                    aVar = aVar2;
                    if (obj != aVar) {
                        str4 = str12;
                        consumptionRepository$syncSpansForRead$13 = consumptionRepository$syncSpansForRead$12;
                        list2 = list3;
                        apiResult = (ApiResult) obj;
                        if (!(apiResult instanceof ApiResult.Success)) {
                        }
                    }
                    return aVar;
                }
                return z.f31622a;
            }
        }
        consumptionRepository$syncSpansForRead$1 = new ConsumptionRepository$syncSpansForRead$1(this, cVar);
        Object obj2 = consumptionRepository$syncSpansForRead$1.result;
        i10 = consumptionRepository$syncSpansForRead$1.label;
        String str62 = " spans for read ";
        int i132 = 10;
        xn.a aVar22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        if (!it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // io.elevenlabs.domain.services.ConsumptionTrackingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object saveSpan(ConsumptionSpan consumptionSpan, wn.c<? super z> cVar) {
        ConsumptionRepository$saveSpan$1 consumptionRepository$saveSpan$1;
        int i10;
        ConsumptionSpan consumptionSpan2;
        Long endCharOffset;
        Long l4;
        ConsumptionSpan consumptionSpan3;
        Long l7;
        Long l10;
        ReadMeta readMeta;
        if (cVar instanceof ConsumptionRepository$saveSpan$1) {
            consumptionRepository$saveSpan$1 = (ConsumptionRepository$saveSpan$1) cVar;
            int i11 = consumptionRepository$saveSpan$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                consumptionRepository$saveSpan$1.label = i11 - Integer.MIN_VALUE;
                Object obj = consumptionRepository$saveSpan$1.result;
                i10 = consumptionRepository$saveSpan$1.label;
                z zVar = z.f31622a;
                boolean z6 = true;
                xn.a aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            l7 = (Long) consumptionRepository$saveSpan$1.L$1;
                            consumptionSpan3 = (ConsumptionSpan) consumptionRepository$saveSpan$1.L$0;
                            sn.a.g(obj);
                            readMeta = (ReadMeta) obj;
                            if (readMeta == null && ReadMetaKt.isMediaType(readMeta)) {
                                l10 = l7;
                                this.analytics.log(new Analytics.Event.ConsumptionSpanTracked(ReadMetaKt.getAnalyticsValue(consumptionSpan3.getType()), consumptionSpan3.getReadId(), consumptionSpan3.getEndSeconds() - consumptionSpan3.getStartSeconds(), l10, ReadMetaKt.getAnalyticsValue(consumptionSpan3.getPlaybackSource()), consumptionSpan3.getDeviceOnline(), z6));
                                return zVar;
                            }
                            l4 = l7;
                            consumptionSpan2 = consumptionSpan3;
                            z6 = false;
                            consumptionSpan3 = consumptionSpan2;
                            l10 = l4;
                            this.analytics.log(new Analytics.Event.ConsumptionSpanTracked(ReadMetaKt.getAnalyticsValue(consumptionSpan3.getType()), consumptionSpan3.getReadId(), consumptionSpan3.getEndSeconds() - consumptionSpan3.getStartSeconds(), l10, ReadMetaKt.getAnalyticsValue(consumptionSpan3.getPlaybackSource()), consumptionSpan3.getDeviceOnline(), z6));
                            return zVar;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    consumptionSpan2 = (ConsumptionSpan) consumptionRepository$saveSpan$1.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    if (consumptionSpan.getEndSeconds() <= consumptionSpan.getStartSeconds()) {
                        Logger.logWarning$default(this.logger, this.tag, "Discarding invalid span: file=" + consumptionSpan.getAudioFileNumber() + Separators.SP + consumptionSpan.getStartSeconds() + "s-" + consumptionSpan.getEndSeconds() + "s", null, 4, null);
                        return zVar;
                    }
                    ConsumptionSpanDao consumptionSpanDao = this.consumptionSpanDao;
                    ConsumptionSpanEntity access$toEntity = ConsumptionRepositoryKt.access$toEntity(consumptionSpan);
                    consumptionRepository$saveSpan$1.L$0 = consumptionSpan;
                    consumptionRepository$saveSpan$1.label = 1;
                    if (consumptionSpanDao.insert(access$toEntity, consumptionRepository$saveSpan$1) != aVar) {
                        consumptionSpan2 = consumptionSpan;
                    }
                    return aVar;
                }
                SyncConsumptionSpansWorker.INSTANCE.enqueue(this.appContext);
                endCharOffset = consumptionSpan2.getEndCharOffset();
                l4 = null;
                if (endCharOffset != null) {
                    long longValue = endCharOffset.longValue();
                    Long startCharOffset = consumptionSpan2.getStartCharOffset();
                    if (startCharOffset != null) {
                        l4 = new Long(longValue - startCharOffset.longValue());
                    }
                }
                if (consumptionSpan2.getType() == AudioType.TTS) {
                    ReadsService readsService = (ReadsService) this.readsService.get();
                    String readId = consumptionSpan2.getReadId();
                    consumptionRepository$saveSpan$1.L$0 = consumptionSpan2;
                    consumptionRepository$saveSpan$1.L$1 = l4;
                    consumptionRepository$saveSpan$1.label = 2;
                    obj = readsService.getRead(readId, consumptionRepository$saveSpan$1);
                    if (obj != aVar) {
                        consumptionSpan3 = consumptionSpan2;
                        l7 = l4;
                        readMeta = (ReadMeta) obj;
                        if (readMeta == null) {
                        }
                        l4 = l7;
                        consumptionSpan2 = consumptionSpan3;
                    }
                    return aVar;
                }
                z6 = false;
                consumptionSpan3 = consumptionSpan2;
                l10 = l4;
                this.analytics.log(new Analytics.Event.ConsumptionSpanTracked(ReadMetaKt.getAnalyticsValue(consumptionSpan3.getType()), consumptionSpan3.getReadId(), consumptionSpan3.getEndSeconds() - consumptionSpan3.getStartSeconds(), l10, ReadMetaKt.getAnalyticsValue(consumptionSpan3.getPlaybackSource()), consumptionSpan3.getDeviceOnline(), z6));
                return zVar;
            }
        }
        consumptionRepository$saveSpan$1 = new ConsumptionRepository$saveSpan$1(this, cVar);
        Object obj2 = consumptionRepository$saveSpan$1.result;
        i10 = consumptionRepository$saveSpan$1.label;
        z zVar2 = z.f31622a;
        boolean z62 = true;
        xn.a aVar2 = xn.a.f37986a;
        if (i10 == 0) {
        }
        SyncConsumptionSpansWorker.INSTANCE.enqueue(this.appContext);
        endCharOffset = consumptionSpan2.getEndCharOffset();
        l4 = null;
        if (endCharOffset != null) {
        }
        if (consumptionSpan2.getType() == AudioType.TTS) {
        }
        z62 = false;
        consumptionSpan3 = consumptionSpan2;
        l10 = l4;
        this.analytics.log(new Analytics.Event.ConsumptionSpanTracked(ReadMetaKt.getAnalyticsValue(consumptionSpan3.getType()), consumptionSpan3.getReadId(), consumptionSpan3.getEndSeconds() - consumptionSpan3.getStartSeconds(), l10, ReadMetaKt.getAnalyticsValue(consumptionSpan3.getPlaybackSource()), consumptionSpan3.getDeviceOnline(), z62));
        return zVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0056, code lost:
    
        if (r9 == r5) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncSpans(wn.c<? super z> cVar) {
        ConsumptionRepository$syncSpans$1 consumptionRepository$syncSpans$1;
        int i10;
        List list;
        Iterator it;
        if (cVar instanceof ConsumptionRepository$syncSpans$1) {
            consumptionRepository$syncSpans$1 = (ConsumptionRepository$syncSpans$1) cVar;
            int i11 = consumptionRepository$syncSpans$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                consumptionRepository$syncSpans$1.label = i11 - Integer.MIN_VALUE;
                Object obj = consumptionRepository$syncSpans$1.result;
                i10 = consumptionRepository$syncSpans$1.label;
                z zVar = z.f31622a;
                Object obj2 = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            it = (Iterator) consumptionRepository$syncSpans$1.L$2;
                            sn.a.g(obj);
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                String str = (String) entry.getKey();
                                List<ConsumptionSpanEntity> list2 = (List) entry.getValue();
                                consumptionRepository$syncSpans$1.L$0 = null;
                                consumptionRepository$syncSpans$1.L$1 = null;
                                consumptionRepository$syncSpans$1.L$2 = it;
                                consumptionRepository$syncSpans$1.L$3 = null;
                                consumptionRepository$syncSpans$1.L$4 = null;
                                consumptionRepository$syncSpans$1.label = 2;
                                if (syncSpansForRead(str, list2, consumptionRepository$syncSpans$1) == obj2) {
                                    return obj2;
                                }
                            }
                            return zVar;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ConsumptionSpanDao consumptionSpanDao = this.consumptionSpanDao;
                    consumptionRepository$syncSpans$1.label = 1;
                    obj = consumptionSpanDao.getAll(consumptionRepository$syncSpans$1);
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                    return zVar;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : list) {
                    String read_id = ((ConsumptionSpanEntity) obj3).getRead_id();
                    Object obj4 = linkedHashMap.get(read_id);
                    if (obj4 == null) {
                        obj4 = new ArrayList();
                        linkedHashMap.put(read_id, obj4);
                    }
                    ((List) obj4).add(obj3);
                }
                it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                }
                return zVar;
            }
        }
        consumptionRepository$syncSpans$1 = new ConsumptionRepository$syncSpans$1(this, cVar);
        Object obj5 = consumptionRepository$syncSpans$1.result;
        i10 = consumptionRepository$syncSpans$1.label;
        z zVar2 = z.f31622a;
        Object obj22 = xn.a.f37986a;
        if (i10 == 0) {
        }
        list = (List) obj5;
        if (!list.isEmpty()) {
        }
    }
}
