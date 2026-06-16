package io.elevenlabs.data.database.entities.voices;

import ae.l;
import androidx.room.d;
import androidx.room.e;
import androidx.room.f;
import androidx.room.j0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import ir.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import tn.t;
import us.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lio/elevenlabs/data/database/entities/voices/VoicesDao_Impl;", "Lio/elevenlabs/data/database/entities/voices/VoicesDao;", "Landroidx/room/j0;", "__db", "<init>", "(Landroidx/room/j0;)V", "", "Lio/elevenlabs/data/database/entities/voices/VoiceEntity;", "voices", "Lsn/z;", "deleteAll", "(Ljava/util/List;)V", "voice", "delete", "(Lio/elevenlabs/data/database/entities/voices/VoiceEntity;)V", "insertAll", "insert", "Lir/i;", "getAll", "()Lir/i;", "", "id", "getById", "(Ljava/lang/String;)Lir/i;", "Landroidx/room/j0;", "Landroidx/room/d;", "__deleteAdapterOfVoiceEntity", "Landroidx/room/d;", "Landroidx/room/f;", "__upsertAdapterOfVoiceEntity", "Landroidx/room/f;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class VoicesDao_Impl implements VoicesDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final j0 __db;
    private final d __deleteAdapterOfVoiceEntity;
    private final f __upsertAdapterOfVoiceEntity;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/voices/VoicesDao_Impl$1", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/voices/VoiceEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/voices/VoiceEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.voices.VoicesDao_Impl$1 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends d {
        @Override // androidx.room.d
        public void bind(mb.c statement, VoiceEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getVoiceId());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "DELETE FROM `voices` WHERE `voiceId` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/voices/VoicesDao_Impl$2", "Landroidx/room/e;", "Lio/elevenlabs/data/database/entities/voices/VoiceEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/voices/VoiceEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.voices.VoicesDao_Impl$2 */
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
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/voices/VoicesDao_Impl$3", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/voices/VoiceEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/voices/VoiceEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.voices.VoicesDao_Impl$3 */
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

    public VoicesDao_Impl(j0 j0Var) {
        j0Var.getClass();
        this.__db = j0Var;
        this.__deleteAdapterOfVoiceEntity = new d() { // from class: io.elevenlabs.data.database.entities.voices.VoicesDao_Impl.1
            @Override // androidx.room.d
            public void bind(mb.c statement, VoiceEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getVoiceId());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "DELETE FROM `voices` WHERE `voiceId` = ?";
            }
        };
        this.__upsertAdapterOfVoiceEntity = new f(new e() { // from class: io.elevenlabs.data.database.entities.voices.VoicesDao_Impl.2
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
        }, new d() { // from class: io.elevenlabs.data.database.entities.voices.VoicesDao_Impl.3
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
    }

    public static final z delete$lambda$0(VoicesDao_Impl voicesDao_Impl, VoiceEntity voiceEntity, mb.a aVar) {
        aVar.getClass();
        voicesDao_Impl.__deleteAdapterOfVoiceEntity.handle(aVar, voiceEntity);
        return z.f31622a;
    }

    public static final z deleteAll$lambda$0(VoicesDao_Impl voicesDao_Impl, List list, mb.a aVar) {
        aVar.getClass();
        voicesDao_Impl.__deleteAdapterOfVoiceEntity.handleMultiple(aVar, list);
        return z.f31622a;
    }

    public static final List getAll$lambda$0(String str, mb.a aVar) {
        String Y;
        boolean z6;
        String Y2;
        String Y3;
        String Y4;
        String Y5;
        Long valueOf;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            int F = l.F(l02, "voiceId");
            int F2 = l.F(l02, "ownerId");
            int F3 = l.F(l02, DiagnosticsEntry.NAME_KEY);
            int F4 = l.F(l02, "accent");
            int F5 = l.F(l02, "gender");
            int F6 = l.F(l02, "age");
            int F7 = l.F(l02, "descriptive");
            int F8 = l.F(l02, "useCase");
            int F9 = l.F(l02, "category");
            int F10 = l.F(l02, "fromVoiceLibrary");
            int F11 = l.F(l02, "subtitle");
            int F12 = l.F(l02, "description");
            int F13 = l.F(l02, "previewUrl");
            int F14 = l.F(l02, "imageUrl");
            int F15 = l.F(l02, "favoritedAtUnix");
            int F16 = l.F(l02, "createdAtUnix");
            ArrayList arrayList = new ArrayList();
            while (l02.h0()) {
                String Y6 = l02.Y(F);
                Long l4 = null;
                if (l02.isNull(F2)) {
                    Y = null;
                } else {
                    Y = l02.Y(F2);
                }
                String Y7 = l02.Y(F3);
                String Y8 = l02.Y(F4);
                String Y9 = l02.Y(F5);
                String Y10 = l02.Y(F6);
                String Y11 = l02.Y(F7);
                String Y12 = l02.Y(F8);
                String Y13 = l02.Y(F9);
                int i10 = F2;
                int i11 = F3;
                if (((int) l02.getLong(F10)) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z10 = z6;
                if (l02.isNull(F11)) {
                    Y2 = null;
                } else {
                    Y2 = l02.Y(F11);
                }
                if (l02.isNull(F12)) {
                    Y3 = null;
                } else {
                    Y3 = l02.Y(F12);
                }
                if (l02.isNull(F13)) {
                    Y4 = null;
                } else {
                    Y4 = l02.Y(F13);
                }
                if (l02.isNull(F14)) {
                    Y5 = null;
                } else {
                    Y5 = l02.Y(F14);
                }
                int i12 = F15;
                if (l02.isNull(i12)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(l02.getLong(i12));
                }
                int i13 = F16;
                if (!l02.isNull(i13)) {
                    l4 = Long.valueOf(l02.getLong(i13));
                }
                int i14 = F;
                arrayList.add(new VoiceEntity(Y6, Y, Y7, Y8, Y9, Y10, Y11, Y12, Y13, z10, Y2, Y3, Y4, Y5, valueOf, l4));
                F = i14;
                F15 = i12;
                F16 = i13;
                F2 = i10;
                F3 = i11;
            }
            return arrayList;
        } finally {
            l02.close();
        }
    }

    public static final VoiceEntity getById$lambda$0(String str, String str2, mb.a aVar) {
        String Y;
        boolean z6;
        String Y2;
        String Y3;
        String Y4;
        String Y5;
        Long valueOf;
        aVar.getClass();
        mb.c l02 = aVar.l0(str);
        try {
            l02.s(1, str2);
            int F = l.F(l02, "voiceId");
            int F2 = l.F(l02, "ownerId");
            int F3 = l.F(l02, DiagnosticsEntry.NAME_KEY);
            int F4 = l.F(l02, "accent");
            int F5 = l.F(l02, "gender");
            int F6 = l.F(l02, "age");
            int F7 = l.F(l02, "descriptive");
            int F8 = l.F(l02, "useCase");
            int F9 = l.F(l02, "category");
            int F10 = l.F(l02, "fromVoiceLibrary");
            int F11 = l.F(l02, "subtitle");
            int F12 = l.F(l02, "description");
            int F13 = l.F(l02, "previewUrl");
            int F14 = l.F(l02, "imageUrl");
            int F15 = l.F(l02, "favoritedAtUnix");
            int F16 = l.F(l02, "createdAtUnix");
            VoiceEntity voiceEntity = null;
            Long valueOf2 = null;
            if (l02.h0()) {
                String Y6 = l02.Y(F);
                if (l02.isNull(F2)) {
                    Y = null;
                } else {
                    Y = l02.Y(F2);
                }
                String Y7 = l02.Y(F3);
                String Y8 = l02.Y(F4);
                String Y9 = l02.Y(F5);
                String Y10 = l02.Y(F6);
                String Y11 = l02.Y(F7);
                String Y12 = l02.Y(F8);
                String Y13 = l02.Y(F9);
                if (((int) l02.getLong(F10)) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (l02.isNull(F11)) {
                    Y2 = null;
                } else {
                    Y2 = l02.Y(F11);
                }
                if (l02.isNull(F12)) {
                    Y3 = null;
                } else {
                    Y3 = l02.Y(F12);
                }
                if (l02.isNull(F13)) {
                    Y4 = null;
                } else {
                    Y4 = l02.Y(F13);
                }
                if (l02.isNull(F14)) {
                    Y5 = null;
                } else {
                    Y5 = l02.Y(F14);
                }
                if (l02.isNull(F15)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(l02.getLong(F15));
                }
                if (!l02.isNull(F16)) {
                    valueOf2 = Long.valueOf(l02.getLong(F16));
                }
                voiceEntity = new VoiceEntity(Y6, Y, Y7, Y8, Y9, Y10, Y11, Y12, Y13, z6, Y2, Y3, Y4, Y5, valueOf, valueOf2);
            }
            return voiceEntity;
        } finally {
            l02.close();
        }
    }

    public static final z insert$lambda$0(VoicesDao_Impl voicesDao_Impl, VoiceEntity voiceEntity, mb.a aVar) {
        aVar.getClass();
        voicesDao_Impl.__upsertAdapterOfVoiceEntity.b(aVar, voiceEntity);
        return z.f31622a;
    }

    public static final z insertAll$lambda$0(VoicesDao_Impl voicesDao_Impl, List list, mb.a aVar) {
        aVar.getClass();
        voicesDao_Impl.__upsertAdapterOfVoiceEntity.c(aVar, list);
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.voices.VoicesDao
    public void delete(VoiceEntity voice) {
        voice.getClass();
        g.C(this.__db, false, true, new b(this, voice, 1));
    }

    @Override // io.elevenlabs.data.database.entities.voices.VoicesDao
    public void deleteAll(List<VoiceEntity> voices) {
        voices.getClass();
        g.C(this.__db, false, true, new c(this, voices, 1));
    }

    @Override // io.elevenlabs.data.database.entities.voices.VoicesDao
    public i getAll() {
        return tb.a.n(this.__db, false, new String[]{"voices"}, new fm.d(18));
    }

    @Override // io.elevenlabs.data.database.entities.voices.VoicesDao
    public i getById(String id2) {
        id2.getClass();
        return tb.a.n(this.__db, false, new String[]{"voices"}, new am.c(id2, 2));
    }

    @Override // io.elevenlabs.data.database.entities.voices.VoicesDao
    public void insert(VoiceEntity voice) {
        voice.getClass();
        g.C(this.__db, false, true, new b(this, voice, 0));
    }

    @Override // io.elevenlabs.data.database.entities.voices.VoicesDao
    public void insertAll(List<VoiceEntity> voices) {
        voices.getClass();
        g.C(this.__db, false, true, new c(this, voices, 0));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/data/database/entities/voices/VoicesDao_Impl$Companion;", "", "<init>", "()V", "", "Loo/d;", "getRequiredConverters", "()Ljava/util/List;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
