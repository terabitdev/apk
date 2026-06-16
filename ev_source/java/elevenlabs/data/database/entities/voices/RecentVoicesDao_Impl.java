package io.elevenlabs.data.database.entities.voices;

import ae.l;
import androidx.room.d;
import androidx.room.e;
import androidx.room.f;
import androidx.room.j0;
import io.elevenlabs.data.database.entities.reads.h;
import ir.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.t;
import us.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0010\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\u000bJ\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f¨\u0006\""}, d2 = {"Lio/elevenlabs/data/database/entities/voices/RecentVoicesDao_Impl;", "Lio/elevenlabs/data/database/entities/voices/RecentVoicesDao;", "Landroidx/room/j0;", "__db", "<init>", "(Landroidx/room/j0;)V", "", "Lio/elevenlabs/data/database/entities/voices/RecentVoiceEntity;", "entities", "Lsn/z;", "insertRecentVoices", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/data/database/entities/voices/VoiceEntity;", "voices", "", "lastUsedAtUnixMillis", "insertAll", "(Ljava/util/List;JLwn/c;)Ljava/lang/Object;", "upsertVoices", "entity", "insertRecentVoice", "(Lio/elevenlabs/data/database/entities/voices/RecentVoiceEntity;Lwn/c;)Ljava/lang/Object;", "Lir/i;", "observeRecentVoices", "()Lir/i;", "Landroidx/room/j0;", "Landroidx/room/e;", "__insertAdapterOfRecentVoiceEntity", "Landroidx/room/e;", "Landroidx/room/f;", "__upsertAdapterOfVoiceEntity", "Landroidx/room/f;", "__upsertAdapterOfRecentVoiceEntity", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class RecentVoicesDao_Impl implements RecentVoicesDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final j0 __db;
    private final e __insertAdapterOfRecentVoiceEntity;
    private final f __upsertAdapterOfRecentVoiceEntity;
    private final f __upsertAdapterOfVoiceEntity;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/voices/RecentVoicesDao_Impl$1", "Landroidx/room/e;", "Lio/elevenlabs/data/database/entities/voices/RecentVoiceEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/voices/RecentVoiceEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.voices.RecentVoicesDao_Impl$1 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends e {
        @Override // androidx.room.e
        public void bind(mb.c statement, RecentVoiceEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getVoiceId());
            statement.c(2, entity.getLastUsedAtUnixMillis());
        }

        @Override // androidx.room.e
        public String createQuery() {
            return "INSERT OR IGNORE INTO `recent_voices` (`voiceId`,`lastUsedAtUnixMillis`) VALUES (?,?)";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/voices/RecentVoicesDao_Impl$2", "Landroidx/room/e;", "Lio/elevenlabs/data/database/entities/voices/VoiceEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/voices/VoiceEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.voices.RecentVoicesDao_Impl$2 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends e {
        @Override // androidx.room.e
        public void bind(mb.c statement, VoiceEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getVoiceId());
            String ownerId = entity.getOwnerId();
            if (ownerId == null) {
                statement.f(2);
            } else {
                statement.s(2, ownerId);
            }
            statement.s(3, entity.getName());
            statement.s(4, entity.getAccent());
            statement.s(5, entity.getGender());
            statement.s(6, entity.getAge());
            statement.s(7, entity.getDescriptive());
            statement.s(8, entity.getUseCase());
            statement.s(9, entity.getCategory());
            statement.c(10, entity.getFromVoiceLibrary() ? 1L : 0L);
            String subtitle = entity.getSubtitle();
            if (subtitle == null) {
                statement.f(11);
            } else {
                statement.s(11, subtitle);
            }
            String description = entity.getDescription();
            if (description == null) {
                statement.f(12);
            } else {
                statement.s(12, description);
            }
            String previewUrl = entity.getPreviewUrl();
            if (previewUrl == null) {
                statement.f(13);
            } else {
                statement.s(13, previewUrl);
            }
            String imageUrl = entity.getImageUrl();
            if (imageUrl == null) {
                statement.f(14);
            } else {
                statement.s(14, imageUrl);
            }
            Long favoritedAtUnix = entity.getFavoritedAtUnix();
            if (favoritedAtUnix == null) {
                statement.f(15);
            } else {
                statement.c(15, favoritedAtUnix.longValue());
            }
            Long createdAtUnix = entity.getCreatedAtUnix();
            if (createdAtUnix == null) {
                statement.f(16);
            } else {
                statement.c(16, createdAtUnix.longValue());
            }
        }

        @Override // androidx.room.e
        public String createQuery() {
            return "INSERT INTO `voices` (`voiceId`,`ownerId`,`name`,`accent`,`gender`,`age`,`descriptive`,`useCase`,`category`,`fromVoiceLibrary`,`subtitle`,`description`,`previewUrl`,`imageUrl`,`favoritedAtUnix`,`createdAtUnix`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/voices/RecentVoicesDao_Impl$3", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/voices/VoiceEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/voices/VoiceEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.voices.RecentVoicesDao_Impl$3 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends d {
        @Override // androidx.room.d
        public void bind(mb.c statement, VoiceEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getVoiceId());
            String ownerId = entity.getOwnerId();
            if (ownerId == null) {
                statement.f(2);
            } else {
                statement.s(2, ownerId);
            }
            statement.s(3, entity.getName());
            statement.s(4, entity.getAccent());
            statement.s(5, entity.getGender());
            statement.s(6, entity.getAge());
            statement.s(7, entity.getDescriptive());
            statement.s(8, entity.getUseCase());
            statement.s(9, entity.getCategory());
            statement.c(10, entity.getFromVoiceLibrary() ? 1L : 0L);
            String subtitle = entity.getSubtitle();
            if (subtitle == null) {
                statement.f(11);
            } else {
                statement.s(11, subtitle);
            }
            String description = entity.getDescription();
            if (description == null) {
                statement.f(12);
            } else {
                statement.s(12, description);
            }
            String previewUrl = entity.getPreviewUrl();
            if (previewUrl == null) {
                statement.f(13);
            } else {
                statement.s(13, previewUrl);
            }
            String imageUrl = entity.getImageUrl();
            if (imageUrl == null) {
                statement.f(14);
            } else {
                statement.s(14, imageUrl);
            }
            Long favoritedAtUnix = entity.getFavoritedAtUnix();
            if (favoritedAtUnix == null) {
                statement.f(15);
            } else {
                statement.c(15, favoritedAtUnix.longValue());
            }
            Long createdAtUnix = entity.getCreatedAtUnix();
            if (createdAtUnix == null) {
                statement.f(16);
            } else {
                statement.c(16, createdAtUnix.longValue());
            }
            statement.s(17, entity.getVoiceId());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE `voices` SET `voiceId` = ?,`ownerId` = ?,`name` = ?,`accent` = ?,`gender` = ?,`age` = ?,`descriptive` = ?,`useCase` = ?,`category` = ?,`fromVoiceLibrary` = ?,`subtitle` = ?,`description` = ?,`previewUrl` = ?,`imageUrl` = ?,`favoritedAtUnix` = ?,`createdAtUnix` = ? WHERE `voiceId` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/voices/RecentVoicesDao_Impl$4", "Landroidx/room/e;", "Lio/elevenlabs/data/database/entities/voices/RecentVoiceEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/voices/RecentVoiceEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.voices.RecentVoicesDao_Impl$4 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass4 extends e {
        @Override // androidx.room.e
        public void bind(mb.c statement, RecentVoiceEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getVoiceId());
            statement.c(2, entity.getLastUsedAtUnixMillis());
        }

        @Override // androidx.room.e
        public String createQuery() {
            return "INSERT INTO `recent_voices` (`voiceId`,`lastUsedAtUnixMillis`) VALUES (?,?)";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/voices/RecentVoicesDao_Impl$5", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/voices/RecentVoiceEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/voices/RecentVoiceEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.voices.RecentVoicesDao_Impl$5 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass5 extends d {
        @Override // androidx.room.d
        public void bind(mb.c statement, RecentVoiceEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getVoiceId());
            statement.c(2, entity.getLastUsedAtUnixMillis());
            statement.s(3, entity.getVoiceId());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE `recent_voices` SET `voiceId` = ?,`lastUsedAtUnixMillis` = ? WHERE `voiceId` = ?";
        }
    }

    public RecentVoicesDao_Impl(j0 j0Var) {
        j0Var.getClass();
        this.__db = j0Var;
        this.__insertAdapterOfRecentVoiceEntity = new e() { // from class: io.elevenlabs.data.database.entities.voices.RecentVoicesDao_Impl.1
            @Override // androidx.room.e
            public void bind(mb.c statement, RecentVoiceEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getVoiceId());
                statement.c(2, entity.getLastUsedAtUnixMillis());
            }

            @Override // androidx.room.e
            public String createQuery() {
                return "INSERT OR IGNORE INTO `recent_voices` (`voiceId`,`lastUsedAtUnixMillis`) VALUES (?,?)";
            }
        };
        this.__upsertAdapterOfVoiceEntity = new f(new e() { // from class: io.elevenlabs.data.database.entities.voices.RecentVoicesDao_Impl.2
            @Override // androidx.room.e
            public void bind(mb.c statement, VoiceEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getVoiceId());
                String ownerId = entity.getOwnerId();
                if (ownerId == null) {
                    statement.f(2);
                } else {
                    statement.s(2, ownerId);
                }
                statement.s(3, entity.getName());
                statement.s(4, entity.getAccent());
                statement.s(5, entity.getGender());
                statement.s(6, entity.getAge());
                statement.s(7, entity.getDescriptive());
                statement.s(8, entity.getUseCase());
                statement.s(9, entity.getCategory());
                statement.c(10, entity.getFromVoiceLibrary() ? 1L : 0L);
                String subtitle = entity.getSubtitle();
                if (subtitle == null) {
                    statement.f(11);
                } else {
                    statement.s(11, subtitle);
                }
                String description = entity.getDescription();
                if (description == null) {
                    statement.f(12);
                } else {
                    statement.s(12, description);
                }
                String previewUrl = entity.getPreviewUrl();
                if (previewUrl == null) {
                    statement.f(13);
                } else {
                    statement.s(13, previewUrl);
                }
                String imageUrl = entity.getImageUrl();
                if (imageUrl == null) {
                    statement.f(14);
                } else {
                    statement.s(14, imageUrl);
                }
                Long favoritedAtUnix = entity.getFavoritedAtUnix();
                if (favoritedAtUnix == null) {
                    statement.f(15);
                } else {
                    statement.c(15, favoritedAtUnix.longValue());
                }
                Long createdAtUnix = entity.getCreatedAtUnix();
                if (createdAtUnix == null) {
                    statement.f(16);
                } else {
                    statement.c(16, createdAtUnix.longValue());
                }
            }

            @Override // androidx.room.e
            public String createQuery() {
                return "INSERT INTO `voices` (`voiceId`,`ownerId`,`name`,`accent`,`gender`,`age`,`descriptive`,`useCase`,`category`,`fromVoiceLibrary`,`subtitle`,`description`,`previewUrl`,`imageUrl`,`favoritedAtUnix`,`createdAtUnix`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        }, new d() { // from class: io.elevenlabs.data.database.entities.voices.RecentVoicesDao_Impl.3
            @Override // androidx.room.d
            public void bind(mb.c statement, VoiceEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getVoiceId());
                String ownerId = entity.getOwnerId();
                if (ownerId == null) {
                    statement.f(2);
                } else {
                    statement.s(2, ownerId);
                }
                statement.s(3, entity.getName());
                statement.s(4, entity.getAccent());
                statement.s(5, entity.getGender());
                statement.s(6, entity.getAge());
                statement.s(7, entity.getDescriptive());
                statement.s(8, entity.getUseCase());
                statement.s(9, entity.getCategory());
                statement.c(10, entity.getFromVoiceLibrary() ? 1L : 0L);
                String subtitle = entity.getSubtitle();
                if (subtitle == null) {
                    statement.f(11);
                } else {
                    statement.s(11, subtitle);
                }
                String description = entity.getDescription();
                if (description == null) {
                    statement.f(12);
                } else {
                    statement.s(12, description);
                }
                String previewUrl = entity.getPreviewUrl();
                if (previewUrl == null) {
                    statement.f(13);
                } else {
                    statement.s(13, previewUrl);
                }
                String imageUrl = entity.getImageUrl();
                if (imageUrl == null) {
                    statement.f(14);
                } else {
                    statement.s(14, imageUrl);
                }
                Long favoritedAtUnix = entity.getFavoritedAtUnix();
                if (favoritedAtUnix == null) {
                    statement.f(15);
                } else {
                    statement.c(15, favoritedAtUnix.longValue());
                }
                Long createdAtUnix = entity.getCreatedAtUnix();
                if (createdAtUnix == null) {
                    statement.f(16);
                } else {
                    statement.c(16, createdAtUnix.longValue());
                }
                statement.s(17, entity.getVoiceId());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE `voices` SET `voiceId` = ?,`ownerId` = ?,`name` = ?,`accent` = ?,`gender` = ?,`age` = ?,`descriptive` = ?,`useCase` = ?,`category` = ?,`fromVoiceLibrary` = ?,`subtitle` = ?,`description` = ?,`previewUrl` = ?,`imageUrl` = ?,`favoritedAtUnix` = ?,`createdAtUnix` = ? WHERE `voiceId` = ?";
            }
        });
        this.__upsertAdapterOfRecentVoiceEntity = new f(new e() { // from class: io.elevenlabs.data.database.entities.voices.RecentVoicesDao_Impl.4
            @Override // androidx.room.e
            public void bind(mb.c statement, RecentVoiceEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getVoiceId());
                statement.c(2, entity.getLastUsedAtUnixMillis());
            }

            @Override // androidx.room.e
            public String createQuery() {
                return "INSERT INTO `recent_voices` (`voiceId`,`lastUsedAtUnixMillis`) VALUES (?,?)";
            }
        }, new d() { // from class: io.elevenlabs.data.database.entities.voices.RecentVoicesDao_Impl.5
            @Override // androidx.room.d
            public void bind(mb.c statement, RecentVoiceEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getVoiceId());
                statement.c(2, entity.getLastUsedAtUnixMillis());
                statement.s(3, entity.getVoiceId());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE `recent_voices` SET `voiceId` = ?,`lastUsedAtUnixMillis` = ? WHERE `voiceId` = ?";
            }
        });
    }

    public static final z insertRecentVoice$lambda$0(RecentVoicesDao_Impl recentVoicesDao_Impl, RecentVoiceEntity recentVoiceEntity, mb.a aVar) {
        aVar.getClass();
        recentVoicesDao_Impl.__upsertAdapterOfRecentVoiceEntity.b(aVar, recentVoiceEntity);
        return z.f31622a;
    }

    public static final z insertRecentVoices$lambda$0(RecentVoicesDao_Impl recentVoicesDao_Impl, List list, mb.a aVar) {
        aVar.getClass();
        recentVoicesDao_Impl.__insertAdapterOfRecentVoiceEntity.insert(aVar, (Iterable<Object>) list);
        return z.f31622a;
    }

    public static final List observeRecentVoices$lambda$0(String str, mb.a aVar) {
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            int F = l.F(l02, "voiceId");
            int F2 = l.F(l02, "lastUsedAtUnixMillis");
            ArrayList arrayList = new ArrayList();
            while (l02.h0()) {
                arrayList.add(new RecentVoiceEntity(l02.Y(F), l02.getLong(F2)));
            }
            return arrayList;
        } finally {
            l02.close();
        }
    }

    public static final z upsertVoices$lambda$0(RecentVoicesDao_Impl recentVoicesDao_Impl, List list, mb.a aVar) {
        aVar.getClass();
        recentVoicesDao_Impl.__upsertAdapterOfVoiceEntity.c(aVar, list);
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.voices.RecentVoicesDao
    public Object insertAll(List<VoiceEntity> list, long j4, wn.c<? super z> cVar) {
        Object D = g.D(this.__db, new RecentVoicesDao_Impl$insertAll$2(this, list, j4, null), cVar);
        if (D == xn.a.f37986a) {
            return D;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.voices.RecentVoicesDao
    public Object insertRecentVoice(RecentVoiceEntity recentVoiceEntity, wn.c<? super z> cVar) {
        Object E = g.E(this.__db, false, true, new h(this, recentVoiceEntity, 1), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.voices.RecentVoicesDao
    public Object insertRecentVoices(List<RecentVoiceEntity> list, wn.c<? super z> cVar) {
        Object E = g.E(this.__db, false, true, new a(this, list, 1), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.voices.RecentVoicesDao
    public i observeRecentVoices() {
        return tb.a.n(this.__db, false, new String[]{"recent_voices"}, new fm.d(17));
    }

    @Override // io.elevenlabs.data.database.entities.voices.RecentVoicesDao
    public Object upsertVoices(List<VoiceEntity> list, wn.c<? super z> cVar) {
        Object E = g.E(this.__db, false, true, new a(this, list, 0), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/data/database/entities/voices/RecentVoicesDao_Impl$Companion;", "", "<init>", "()V", "", "Loo/d;", "getRequiredConverters", "()Ljava/util/List;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final List<oo.d> getRequiredConverters() {
            return t.f33547a;
        }

        private Companion() {
        }
    }
}
