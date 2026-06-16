package io.elevenlabs.data.database.entities.collections;

import a2.p;
import a2.t;
import ae.l;
import am.b;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.room.d;
import androidx.room.e;
import androidx.room.f;
import androidx.room.j0;
import com.google.firebase.messaging.Constants;
import io.elevenlabs.data.database.entities.collections.CollectionsDao;
import ir.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import mb.a;
import mb.c;
import sn.z;
import us.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u001f\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lio/elevenlabs/data/database/entities/collections/CollectionsDao_Impl;", "Lio/elevenlabs/data/database/entities/collections/CollectionsDao;", "Landroidx/room/j0;", "__db", "<init>", "(Landroidx/room/j0;)V", "", "Lio/elevenlabs/data/database/entities/collections/CollectionEntity;", "collections", "Lsn/z;", "deleteAll", "(Ljava/util/List;)V", "collection", "delete", "(Lio/elevenlabs/data/database/entities/collections/CollectionEntity;)V", "Lio/elevenlabs/data/database/entities/collections/CollectionsDao$CollectionHasUnreadUpdate;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "updateHasUnread", "(Lio/elevenlabs/data/database/entities/collections/CollectionsDao$CollectionHasUnreadUpdate;)V", "insertAll", "insert", "", "id", "Lir/i;", "observeById", "(Ljava/lang/String;)Lir/i;", "getAll", "()Lir/i;", "Landroidx/room/j0;", "Landroidx/room/d;", "__deleteAdapterOfCollectionEntity", "Landroidx/room/d;", "__updateAdapterOfCollectionHasUnreadUpdateAsCollectionEntity", "Landroidx/room/f;", "__upsertAdapterOfCollectionEntity", "Landroidx/room/f;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CollectionsDao_Impl implements CollectionsDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final j0 __db;
    private final d __deleteAdapterOfCollectionEntity;
    private final d __updateAdapterOfCollectionHasUnreadUpdateAsCollectionEntity;
    private final f __upsertAdapterOfCollectionEntity;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/collections/CollectionsDao_Impl$1", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/collections/CollectionEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/collections/CollectionEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.collections.CollectionsDao_Impl$1 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends d {
        @Override // androidx.room.d
        public void bind(c statement, CollectionEntity entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getId());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "DELETE FROM `collections` WHERE `id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/collections/CollectionsDao_Impl$2", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/collections/CollectionsDao$CollectionHasUnreadUpdate;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/collections/CollectionsDao$CollectionHasUnreadUpdate;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.collections.CollectionsDao_Impl$2 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends d {
        @Override // androidx.room.d
        public void bind(c statement, CollectionsDao.CollectionHasUnreadUpdate entity) {
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getId());
            statement.c(2, entity.getHas_unread() ? 1L : 0L);
            statement.s(3, entity.getId());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE OR ABORT `collections` SET `id` = ?,`has_unread` = ? WHERE `id` = ?";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/collections/CollectionsDao_Impl$3", "Landroidx/room/e;", "Lio/elevenlabs/data/database/entities/collections/CollectionEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/collections/CollectionEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.collections.CollectionsDao_Impl$3 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends e {
        @Override // androidx.room.e
        public void bind(c statement, CollectionEntity entity) {
            Integer num;
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getId());
            statement.s(2, entity.getTitle());
            String subtitle = entity.getSubtitle();
            if (subtitle == null) {
                statement.f(3);
            } else {
                statement.s(3, subtitle);
            }
            statement.c(4, entity.getHas_unread() ? 1L : 0L);
            String description = entity.getDescription();
            if (description == null) {
                statement.f(5);
            } else {
                statement.s(5, description);
            }
            String image_url = entity.getImage_url();
            if (image_url == null) {
                statement.f(6);
            } else {
                statement.s(6, image_url);
            }
            Long last_opened_at_unix = entity.getLast_opened_at_unix();
            if (last_opened_at_unix == null) {
                statement.f(7);
            } else {
                statement.c(7, last_opened_at_unix.longValue());
            }
            Long updated_at_unix = entity.getUpdated_at_unix();
            if (updated_at_unix == null) {
                statement.f(8);
            } else {
                statement.c(8, updated_at_unix.longValue());
            }
            String category = entity.getCategory();
            if (category == null) {
                statement.f(9);
            } else {
                statement.s(9, category);
            }
            Long item_count = entity.getItem_count();
            if (item_count == null) {
                statement.f(10);
            } else {
                statement.c(10, item_count.longValue());
            }
            Boolean is_owner = entity.is_owner();
            if (is_owner != null) {
                num = Integer.valueOf(is_owner.booleanValue() ? 1 : 0);
            } else {
                num = null;
            }
            if (num == null) {
                statement.f(11);
            } else {
                statement.c(11, num.intValue());
            }
            String icon = entity.getIcon();
            if (icon == null) {
                statement.f(12);
            } else {
                statement.s(12, icon);
            }
        }

        @Override // androidx.room.e
        public String createQuery() {
            return "INSERT INTO `collections` (`id`,`title`,`subtitle`,`has_unread`,`description`,`image_url`,`last_opened_at_unix`,`updated_at_unix`,`category`,`item_count`,`is_owner`,`icon`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/collections/CollectionsDao_Impl$4", "Landroidx/room/d;", "Lio/elevenlabs/data/database/entities/collections/CollectionEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/collections/CollectionEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.collections.CollectionsDao_Impl$4 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass4 extends d {
        @Override // androidx.room.d
        public void bind(c statement, CollectionEntity entity) {
            Integer num;
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getId());
            statement.s(2, entity.getTitle());
            String subtitle = entity.getSubtitle();
            if (subtitle == null) {
                statement.f(3);
            } else {
                statement.s(3, subtitle);
            }
            statement.c(4, entity.getHas_unread() ? 1L : 0L);
            String description = entity.getDescription();
            if (description == null) {
                statement.f(5);
            } else {
                statement.s(5, description);
            }
            String image_url = entity.getImage_url();
            if (image_url == null) {
                statement.f(6);
            } else {
                statement.s(6, image_url);
            }
            Long last_opened_at_unix = entity.getLast_opened_at_unix();
            if (last_opened_at_unix == null) {
                statement.f(7);
            } else {
                statement.c(7, last_opened_at_unix.longValue());
            }
            Long updated_at_unix = entity.getUpdated_at_unix();
            if (updated_at_unix == null) {
                statement.f(8);
            } else {
                statement.c(8, updated_at_unix.longValue());
            }
            String category = entity.getCategory();
            if (category == null) {
                statement.f(9);
            } else {
                statement.s(9, category);
            }
            Long item_count = entity.getItem_count();
            if (item_count == null) {
                statement.f(10);
            } else {
                statement.c(10, item_count.longValue());
            }
            Boolean is_owner = entity.is_owner();
            if (is_owner != null) {
                num = Integer.valueOf(is_owner.booleanValue() ? 1 : 0);
            } else {
                num = null;
            }
            if (num == null) {
                statement.f(11);
            } else {
                statement.c(11, num.intValue());
            }
            String icon = entity.getIcon();
            if (icon == null) {
                statement.f(12);
            } else {
                statement.s(12, icon);
            }
            statement.s(13, entity.getId());
        }

        @Override // androidx.room.d
        public String createQuery() {
            return "UPDATE `collections` SET `id` = ?,`title` = ?,`subtitle` = ?,`has_unread` = ?,`description` = ?,`image_url` = ?,`last_opened_at_unix` = ?,`updated_at_unix` = ?,`category` = ?,`item_count` = ?,`is_owner` = ?,`icon` = ? WHERE `id` = ?";
        }
    }

    public CollectionsDao_Impl(j0 j0Var) {
        j0Var.getClass();
        this.__db = j0Var;
        this.__deleteAdapterOfCollectionEntity = new d() { // from class: io.elevenlabs.data.database.entities.collections.CollectionsDao_Impl.1
            @Override // androidx.room.d
            public void bind(c statement, CollectionEntity entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getId());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "DELETE FROM `collections` WHERE `id` = ?";
            }
        };
        this.__updateAdapterOfCollectionHasUnreadUpdateAsCollectionEntity = new d() { // from class: io.elevenlabs.data.database.entities.collections.CollectionsDao_Impl.2
            @Override // androidx.room.d
            public void bind(c statement, CollectionsDao.CollectionHasUnreadUpdate entity) {
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getId());
                statement.c(2, entity.getHas_unread() ? 1L : 0L);
                statement.s(3, entity.getId());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE OR ABORT `collections` SET `id` = ?,`has_unread` = ? WHERE `id` = ?";
            }
        };
        this.__upsertAdapterOfCollectionEntity = new f(new e() { // from class: io.elevenlabs.data.database.entities.collections.CollectionsDao_Impl.3
            @Override // androidx.room.e
            public void bind(c statement, CollectionEntity entity) {
                Integer num;
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getId());
                statement.s(2, entity.getTitle());
                String subtitle = entity.getSubtitle();
                if (subtitle == null) {
                    statement.f(3);
                } else {
                    statement.s(3, subtitle);
                }
                statement.c(4, entity.getHas_unread() ? 1L : 0L);
                String description = entity.getDescription();
                if (description == null) {
                    statement.f(5);
                } else {
                    statement.s(5, description);
                }
                String image_url = entity.getImage_url();
                if (image_url == null) {
                    statement.f(6);
                } else {
                    statement.s(6, image_url);
                }
                Long last_opened_at_unix = entity.getLast_opened_at_unix();
                if (last_opened_at_unix == null) {
                    statement.f(7);
                } else {
                    statement.c(7, last_opened_at_unix.longValue());
                }
                Long updated_at_unix = entity.getUpdated_at_unix();
                if (updated_at_unix == null) {
                    statement.f(8);
                } else {
                    statement.c(8, updated_at_unix.longValue());
                }
                String category = entity.getCategory();
                if (category == null) {
                    statement.f(9);
                } else {
                    statement.s(9, category);
                }
                Long item_count = entity.getItem_count();
                if (item_count == null) {
                    statement.f(10);
                } else {
                    statement.c(10, item_count.longValue());
                }
                Boolean is_owner = entity.is_owner();
                if (is_owner != null) {
                    num = Integer.valueOf(is_owner.booleanValue() ? 1 : 0);
                } else {
                    num = null;
                }
                if (num == null) {
                    statement.f(11);
                } else {
                    statement.c(11, num.intValue());
                }
                String icon = entity.getIcon();
                if (icon == null) {
                    statement.f(12);
                } else {
                    statement.s(12, icon);
                }
            }

            @Override // androidx.room.e
            public String createQuery() {
                return "INSERT INTO `collections` (`id`,`title`,`subtitle`,`has_unread`,`description`,`image_url`,`last_opened_at_unix`,`updated_at_unix`,`category`,`item_count`,`is_owner`,`icon`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        }, new d() { // from class: io.elevenlabs.data.database.entities.collections.CollectionsDao_Impl.4
            @Override // androidx.room.d
            public void bind(c statement, CollectionEntity entity) {
                Integer num;
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getId());
                statement.s(2, entity.getTitle());
                String subtitle = entity.getSubtitle();
                if (subtitle == null) {
                    statement.f(3);
                } else {
                    statement.s(3, subtitle);
                }
                statement.c(4, entity.getHas_unread() ? 1L : 0L);
                String description = entity.getDescription();
                if (description == null) {
                    statement.f(5);
                } else {
                    statement.s(5, description);
                }
                String image_url = entity.getImage_url();
                if (image_url == null) {
                    statement.f(6);
                } else {
                    statement.s(6, image_url);
                }
                Long last_opened_at_unix = entity.getLast_opened_at_unix();
                if (last_opened_at_unix == null) {
                    statement.f(7);
                } else {
                    statement.c(7, last_opened_at_unix.longValue());
                }
                Long updated_at_unix = entity.getUpdated_at_unix();
                if (updated_at_unix == null) {
                    statement.f(8);
                } else {
                    statement.c(8, updated_at_unix.longValue());
                }
                String category = entity.getCategory();
                if (category == null) {
                    statement.f(9);
                } else {
                    statement.s(9, category);
                }
                Long item_count = entity.getItem_count();
                if (item_count == null) {
                    statement.f(10);
                } else {
                    statement.c(10, item_count.longValue());
                }
                Boolean is_owner = entity.is_owner();
                if (is_owner != null) {
                    num = Integer.valueOf(is_owner.booleanValue() ? 1 : 0);
                } else {
                    num = null;
                }
                if (num == null) {
                    statement.f(11);
                } else {
                    statement.c(11, num.intValue());
                }
                String icon = entity.getIcon();
                if (icon == null) {
                    statement.f(12);
                } else {
                    statement.s(12, icon);
                }
                statement.s(13, entity.getId());
            }

            @Override // androidx.room.d
            public String createQuery() {
                return "UPDATE `collections` SET `id` = ?,`title` = ?,`subtitle` = ?,`has_unread` = ?,`description` = ?,`image_url` = ?,`last_opened_at_unix` = ?,`updated_at_unix` = ?,`category` = ?,`item_count` = ?,`is_owner` = ?,`icon` = ? WHERE `id` = ?";
            }
        });
    }

    public static final z delete$lambda$0(CollectionsDao_Impl collectionsDao_Impl, CollectionEntity collectionEntity, a aVar) {
        aVar.getClass();
        collectionsDao_Impl.__deleteAdapterOfCollectionEntity.handle(aVar, collectionEntity);
        return z.f31622a;
    }

    public static final z deleteAll$lambda$0(CollectionsDao_Impl collectionsDao_Impl, List list, a aVar) {
        aVar.getClass();
        collectionsDao_Impl.__deleteAdapterOfCollectionEntity.handleMultiple(aVar, list);
        return z.f31622a;
    }

    public static final List getAll$lambda$0(String str, a aVar) {
        String Y;
        boolean z6;
        String Y2;
        String Y3;
        Long valueOf;
        Long valueOf2;
        String Y4;
        Long valueOf3;
        int i10;
        Integer valueOf4;
        Boolean bool;
        boolean z10;
        aVar.getClass();
        c l02 = aVar.l0(str);
        try {
            int F = l.F(l02, "id");
            int F2 = l.F(l02, "title");
            int F3 = l.F(l02, "subtitle");
            int F4 = l.F(l02, "has_unread");
            int F5 = l.F(l02, "description");
            int F6 = l.F(l02, "image_url");
            int F7 = l.F(l02, "last_opened_at_unix");
            int F8 = l.F(l02, "updated_at_unix");
            int F9 = l.F(l02, "category");
            int F10 = l.F(l02, "item_count");
            int F11 = l.F(l02, "is_owner");
            int F12 = l.F(l02, ParameterNames.ICON);
            ArrayList arrayList = new ArrayList();
            while (l02.h0()) {
                String Y5 = l02.Y(F);
                String Y6 = l02.Y(F2);
                String str2 = null;
                if (l02.isNull(F3)) {
                    Y = null;
                } else {
                    Y = l02.Y(F3);
                }
                int i11 = F2;
                int i12 = F3;
                if (((int) l02.getLong(F4)) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (l02.isNull(F5)) {
                    Y2 = null;
                } else {
                    Y2 = l02.Y(F5);
                }
                if (l02.isNull(F6)) {
                    Y3 = null;
                } else {
                    Y3 = l02.Y(F6);
                }
                if (l02.isNull(F7)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(l02.getLong(F7));
                }
                if (l02.isNull(F8)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(l02.getLong(F8));
                }
                if (l02.isNull(F9)) {
                    Y4 = null;
                } else {
                    Y4 = l02.Y(F9);
                }
                if (l02.isNull(F10)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(l02.getLong(F10));
                }
                if (l02.isNull(F11)) {
                    i10 = F4;
                    valueOf4 = null;
                } else {
                    i10 = F4;
                    valueOf4 = Integer.valueOf((int) l02.getLong(F11));
                }
                if (valueOf4 != null) {
                    if (valueOf4.intValue() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bool = Boolean.valueOf(z10);
                } else {
                    bool = null;
                }
                if (!l02.isNull(F12)) {
                    str2 = l02.Y(F12);
                }
                arrayList.add(new CollectionEntity(Y5, Y6, Y, z6, Y2, Y3, valueOf, valueOf2, Y4, valueOf3, bool, str2));
                F3 = i12;
                F4 = i10;
                F2 = i11;
            }
            l02.close();
            return arrayList;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final z insert$lambda$0(CollectionsDao_Impl collectionsDao_Impl, CollectionEntity collectionEntity, a aVar) {
        aVar.getClass();
        collectionsDao_Impl.__upsertAdapterOfCollectionEntity.b(aVar, collectionEntity);
        return z.f31622a;
    }

    public static final z insertAll$lambda$0(CollectionsDao_Impl collectionsDao_Impl, List list, a aVar) {
        aVar.getClass();
        collectionsDao_Impl.__upsertAdapterOfCollectionEntity.c(aVar, list);
        return z.f31622a;
    }

    public static final CollectionEntity observeById$lambda$0(String str, String str2, a aVar) {
        String Y;
        boolean z6;
        String Y2;
        String Y3;
        Long valueOf;
        Long valueOf2;
        String Y4;
        Long valueOf3;
        Integer valueOf4;
        Boolean bool;
        aVar.getClass();
        c l02 = aVar.l0(str);
        boolean z10 = true;
        try {
            l02.s(1, str2);
            int F = l.F(l02, "id");
            int F2 = l.F(l02, "title");
            int F3 = l.F(l02, "subtitle");
            int F4 = l.F(l02, "has_unread");
            int F5 = l.F(l02, "description");
            int F6 = l.F(l02, "image_url");
            int F7 = l.F(l02, "last_opened_at_unix");
            int F8 = l.F(l02, "updated_at_unix");
            int F9 = l.F(l02, "category");
            int F10 = l.F(l02, "item_count");
            int F11 = l.F(l02, "is_owner");
            int F12 = l.F(l02, ParameterNames.ICON);
            CollectionEntity collectionEntity = null;
            String Y5 = null;
            if (l02.h0()) {
                String Y6 = l02.Y(F);
                String Y7 = l02.Y(F2);
                if (l02.isNull(F3)) {
                    Y = null;
                } else {
                    Y = l02.Y(F3);
                }
                if (((int) l02.getLong(F4)) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (l02.isNull(F5)) {
                    Y2 = null;
                } else {
                    Y2 = l02.Y(F5);
                }
                if (l02.isNull(F6)) {
                    Y3 = null;
                } else {
                    Y3 = l02.Y(F6);
                }
                if (l02.isNull(F7)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(l02.getLong(F7));
                }
                if (l02.isNull(F8)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(l02.getLong(F8));
                }
                if (l02.isNull(F9)) {
                    Y4 = null;
                } else {
                    Y4 = l02.Y(F9);
                }
                if (l02.isNull(F10)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(l02.getLong(F10));
                }
                if (l02.isNull(F11)) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Integer.valueOf((int) l02.getLong(F11));
                }
                if (valueOf4 != null) {
                    if (valueOf4.intValue() == 0) {
                        z10 = false;
                    }
                    bool = Boolean.valueOf(z10);
                } else {
                    bool = null;
                }
                if (!l02.isNull(F12)) {
                    Y5 = l02.Y(F12);
                }
                collectionEntity = new CollectionEntity(Y6, Y7, Y, z6, Y2, Y3, valueOf, valueOf2, Y4, valueOf3, bool, Y5);
            }
            l02.close();
            return collectionEntity;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final z updateHasUnread$lambda$0(CollectionsDao_Impl collectionsDao_Impl, CollectionsDao.CollectionHasUnreadUpdate collectionHasUnreadUpdate, a aVar) {
        aVar.getClass();
        collectionsDao_Impl.__updateAdapterOfCollectionHasUnreadUpdateAsCollectionEntity.handle(aVar, collectionHasUnreadUpdate);
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.collections.CollectionsDao
    public void delete(CollectionEntity collection) {
        collection.getClass();
        g.C(this.__db, false, true, new am.a(this, collection, 1));
    }

    @Override // io.elevenlabs.data.database.entities.collections.CollectionsDao
    public void deleteAll(List<CollectionEntity> collections) {
        collections.getClass();
        g.C(this.__db, false, true, new b(this, collections, 0));
    }

    @Override // io.elevenlabs.data.database.entities.collections.CollectionsDao
    public i getAll() {
        return tb.a.n(this.__db, false, new String[]{"collections"}, new p(13));
    }

    @Override // io.elevenlabs.data.database.entities.collections.CollectionsDao
    public void insert(CollectionEntity collection) {
        collection.getClass();
        g.C(this.__db, false, true, new am.a(this, collection, 0));
    }

    @Override // io.elevenlabs.data.database.entities.collections.CollectionsDao
    public void insertAll(List<CollectionEntity> collections) {
        collections.getClass();
        g.C(this.__db, false, true, new b(this, collections, 1));
    }

    @Override // io.elevenlabs.data.database.entities.collections.CollectionsDao
    public i observeById(String id2) {
        id2.getClass();
        return tb.a.n(this.__db, true, new String[]{"collections"}, new am.c(id2, 0));
    }

    @Override // io.elevenlabs.data.database.entities.collections.CollectionsDao
    public void updateHasUnread(CollectionsDao.CollectionHasUnreadUpdate r42) {
        r42.getClass();
        g.C(this.__db, false, true, new t(this, r42, 7));
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/data/database/entities/collections/CollectionsDao_Impl$Companion;", "", "<init>", "()V", "", "Loo/d;", "getRequiredConverters", "()Ljava/util/List;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final List<oo.d> getRequiredConverters() {
            return tn.t.f33547a;
        }

        private Companion() {
        }
    }
}
