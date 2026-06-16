package io.elevenlabs.data.database.entities.voices;

import ir.i;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H'¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u000b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H'¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r2\u0006\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lio/elevenlabs/data/database/entities/voices/VoicesDao;", "", "", "Lio/elevenlabs/data/database/entities/voices/VoiceEntity;", "voices", "Lsn/z;", "insertAll", "(Ljava/util/List;)V", "voice", "insert", "(Lio/elevenlabs/data/database/entities/voices/VoiceEntity;)V", "deleteAll", "delete", "Lir/i;", "getAll", "()Lir/i;", "", "id", "getById", "(Ljava/lang/String;)Lir/i;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface VoicesDao {
    void delete(VoiceEntity voice);

    void deleteAll(List<VoiceEntity> voices);

    i getAll();

    i getById(String id2);

    void insert(VoiceEntity voice);

    void insertAll(List<VoiceEntity> voices);
}
