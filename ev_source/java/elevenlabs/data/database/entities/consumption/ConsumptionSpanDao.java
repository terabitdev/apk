package io.elevenlabs.data.database.entities.consumption;

import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H§@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000e\u0010\t¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanDao;", "", "Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanEntity;", "span", "Lsn/z;", "insert", "(Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanEntity;Lwn/c;)Ljava/lang/Object;", "", "getAll", "(Lwn/c;)Ljava/lang/Object;", "", "ids", "deleteByIds", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "deleteAll", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ConsumptionSpanDao {
    Object deleteAll(c<? super z> cVar);

    Object deleteByIds(List<String> list, c<? super z> cVar);

    Object getAll(c<? super List<ConsumptionSpanEntity>> cVar);

    Object insert(ConsumptionSpanEntity consumptionSpanEntity, c<? super z> cVar);
}
