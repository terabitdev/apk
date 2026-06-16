package io.elevenlabs.data.database.entities.consumption;

import a2.b;
import a2.t;
import ae.l;
import android.gov.nist.core.Separators;
import androidx.room.e;
import androidx.room.j0;
import androidx.room.m0;
import com.google.protobuf.c6;
import defpackage.f;
import fm.d;
import io.elevenlabs.domain.model.AudioType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import mb.a;
import mb.c;
import sn.z;
import us.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanDao_Impl;", "Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanDao;", "Landroidx/room/j0;", "__db", "<init>", "(Landroidx/room/j0;)V", "Lio/elevenlabs/domain/model/AudioType;", "_value", "", "__AudioType_enumToString", "(Lio/elevenlabs/domain/model/AudioType;)Ljava/lang/String;", "__AudioType_stringToEnum", "(Ljava/lang/String;)Lio/elevenlabs/domain/model/AudioType;", "Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanEntity;", "span", "Lsn/z;", "insert", "(Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanEntity;Lwn/c;)Ljava/lang/Object;", "", "getAll", "(Lwn/c;)Ljava/lang/Object;", "ids", "deleteByIds", "(Ljava/util/List;Lwn/c;)Ljava/lang/Object;", "deleteAll", "Landroidx/room/j0;", "Landroidx/room/e;", "__insertAdapterOfConsumptionSpanEntity", "Landroidx/room/e;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConsumptionSpanDao_Impl implements ConsumptionSpanDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final j0 __db;
    private final e __insertAdapterOfConsumptionSpanEntity;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/elevenlabs/data/database/entities/consumption/ConsumptionSpanDao_Impl$1", "Landroidx/room/e;", "Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanEntity;", "", "createQuery", "()Ljava/lang/String;", "Lmb/c;", "statement", "entity", "Lsn/z;", "bind", "(Lmb/c;Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanEntity;)V", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.data.database.entities.consumption.ConsumptionSpanDao_Impl$1 */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends e {
        public AnonymousClass1() {
        }

        @Override // androidx.room.e
        public void bind(c statement, ConsumptionSpanEntity entity) {
            Integer num;
            statement.getClass();
            entity.getClass();
            statement.s(1, entity.getId());
            statement.s(2, entity.getRead_id());
            String audio_file_number = entity.getAudio_file_number();
            if (audio_file_number == null) {
                statement.f(3);
            } else {
                statement.s(3, audio_file_number);
            }
            statement.e(entity.getStart_seconds(), 4);
            statement.e(entity.getEnd_seconds(), 5);
            Long start_char_offset = entity.getStart_char_offset();
            if (start_char_offset == null) {
                statement.f(6);
            } else {
                statement.c(6, start_char_offset.longValue());
            }
            Long end_char_offset = entity.getEnd_char_offset();
            if (end_char_offset == null) {
                statement.f(7);
            } else {
                statement.c(7, end_char_offset.longValue());
            }
            statement.c(8, entity.getListened_at_unix());
            statement.e(entity.getPlayback_speed(), 9);
            statement.e(entity.getReal_time_duration_seconds(), 10);
            statement.s(11, ConsumptionSpanDao_Impl.this.__AudioType_enumToString(entity.getType()));
            String playback_source = entity.getPlayback_source();
            if (playback_source == null) {
                statement.f(12);
            } else {
                statement.s(12, playback_source);
            }
            Boolean device_online = entity.getDevice_online();
            if (device_online != null) {
                num = Integer.valueOf(device_online.booleanValue() ? 1 : 0);
            } else {
                num = null;
            }
            if (num == null) {
                statement.f(13);
            } else {
                statement.c(13, num.intValue());
            }
            String voice_id = entity.getVoice_id();
            if (voice_id == null) {
                statement.f(14);
            } else {
                statement.s(14, voice_id);
            }
        }

        @Override // androidx.room.e
        public String createQuery() {
            return "INSERT OR REPLACE INTO `consumption_spans` (`id`,`read_id`,`audio_file_number`,`start_seconds`,`end_seconds`,`start_char_offset`,`end_char_offset`,`listened_at_unix`,`playback_speed`,`real_time_duration_seconds`,`type`,`playback_source`,`device_online`,`voice_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioType.values().length];
            try {
                iArr[AudioType.TTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioType.MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConsumptionSpanDao_Impl(j0 j0Var) {
        j0Var.getClass();
        this.__db = j0Var;
        this.__insertAdapterOfConsumptionSpanEntity = new e() { // from class: io.elevenlabs.data.database.entities.consumption.ConsumptionSpanDao_Impl.1
            public AnonymousClass1() {
            }

            @Override // androidx.room.e
            public void bind(c statement, ConsumptionSpanEntity entity) {
                Integer num;
                statement.getClass();
                entity.getClass();
                statement.s(1, entity.getId());
                statement.s(2, entity.getRead_id());
                String audio_file_number = entity.getAudio_file_number();
                if (audio_file_number == null) {
                    statement.f(3);
                } else {
                    statement.s(3, audio_file_number);
                }
                statement.e(entity.getStart_seconds(), 4);
                statement.e(entity.getEnd_seconds(), 5);
                Long start_char_offset = entity.getStart_char_offset();
                if (start_char_offset == null) {
                    statement.f(6);
                } else {
                    statement.c(6, start_char_offset.longValue());
                }
                Long end_char_offset = entity.getEnd_char_offset();
                if (end_char_offset == null) {
                    statement.f(7);
                } else {
                    statement.c(7, end_char_offset.longValue());
                }
                statement.c(8, entity.getListened_at_unix());
                statement.e(entity.getPlayback_speed(), 9);
                statement.e(entity.getReal_time_duration_seconds(), 10);
                statement.s(11, ConsumptionSpanDao_Impl.this.__AudioType_enumToString(entity.getType()));
                String playback_source = entity.getPlayback_source();
                if (playback_source == null) {
                    statement.f(12);
                } else {
                    statement.s(12, playback_source);
                }
                Boolean device_online = entity.getDevice_online();
                if (device_online != null) {
                    num = Integer.valueOf(device_online.booleanValue() ? 1 : 0);
                } else {
                    num = null;
                }
                if (num == null) {
                    statement.f(13);
                } else {
                    statement.c(13, num.intValue());
                }
                String voice_id = entity.getVoice_id();
                if (voice_id == null) {
                    statement.f(14);
                } else {
                    statement.s(14, voice_id);
                }
            }

            @Override // androidx.room.e
            public String createQuery() {
                return "INSERT OR REPLACE INTO `consumption_spans` (`id`,`read_id`,`audio_file_number`,`start_seconds`,`end_seconds`,`start_char_offset`,`end_char_offset`,`listened_at_unix`,`playback_speed`,`real_time_duration_seconds`,`type`,`playback_source`,`device_online`,`voice_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
    }

    public final String __AudioType_enumToString(AudioType _value) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[_value.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return "MEDIA";
            }
            c6.p();
            return null;
        }
        return "TTS";
    }

    private final AudioType __AudioType_stringToEnum(String _value) {
        if (m.c(_value, "TTS")) {
            return AudioType.TTS;
        }
        if (m.c(_value, "MEDIA")) {
            return AudioType.MEDIA;
        }
        c6.t(f.i("Can't convert value to enum, unknown value: ", _value));
        return null;
    }

    public static final z deleteAll$lambda$0(String str, a aVar) {
        aVar.getClass();
        c l02 = aVar.l0(str);
        try {
            l02.h0();
            l02.close();
            return z.f31622a;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final z deleteByIds$lambda$0(String str, List list, a aVar) {
        aVar.getClass();
        c l02 = aVar.l0(str);
        try {
            Iterator it = list.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                l02.s(i10, (String) it.next());
                i10++;
            }
            l02.h0();
            l02.close();
            return z.f31622a;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final List getAll$lambda$0(String str, ConsumptionSpanDao_Impl consumptionSpanDao_Impl, a aVar) {
        String Y;
        Long valueOf;
        Long valueOf2;
        String Y2;
        float f10;
        Integer valueOf3;
        Boolean bool;
        boolean z6;
        aVar.getClass();
        c l02 = aVar.l0(str);
        try {
            int F = l.F(l02, "id");
            int F2 = l.F(l02, "read_id");
            int F3 = l.F(l02, "audio_file_number");
            int F4 = l.F(l02, "start_seconds");
            int F5 = l.F(l02, "end_seconds");
            int F6 = l.F(l02, "start_char_offset");
            int F7 = l.F(l02, "end_char_offset");
            int F8 = l.F(l02, "listened_at_unix");
            int F9 = l.F(l02, "playback_speed");
            int F10 = l.F(l02, "real_time_duration_seconds");
            int F11 = l.F(l02, "type");
            int F12 = l.F(l02, "playback_source");
            int F13 = l.F(l02, "device_online");
            int F14 = l.F(l02, "voice_id");
            ArrayList arrayList = new ArrayList();
            while (l02.h0()) {
                String Y3 = l02.Y(F);
                String Y4 = l02.Y(F2);
                String str2 = null;
                if (l02.isNull(F3)) {
                    Y = null;
                } else {
                    Y = l02.Y(F3);
                }
                double d10 = l02.getDouble(F4);
                double d11 = l02.getDouble(F5);
                if (l02.isNull(F6)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(l02.getLong(F6));
                }
                if (l02.isNull(F7)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(l02.getLong(F7));
                }
                long j4 = l02.getLong(F8);
                int i10 = F2;
                int i11 = F3;
                float f11 = (float) l02.getDouble(F9);
                double d12 = l02.getDouble(F10);
                int i12 = F;
                AudioType __AudioType_stringToEnum = consumptionSpanDao_Impl.__AudioType_stringToEnum(l02.Y(F11));
                if (l02.isNull(F12)) {
                    Y2 = null;
                } else {
                    Y2 = l02.Y(F12);
                }
                if (l02.isNull(F13)) {
                    f10 = f11;
                    valueOf3 = null;
                } else {
                    f10 = f11;
                    valueOf3 = Integer.valueOf((int) l02.getLong(F13));
                }
                if (valueOf3 != null) {
                    if (valueOf3.intValue() != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bool = Boolean.valueOf(z6);
                } else {
                    bool = null;
                }
                if (!l02.isNull(F14)) {
                    str2 = l02.Y(F14);
                }
                arrayList.add(new ConsumptionSpanEntity(Y3, Y4, Y, d10, d11, valueOf, valueOf2, j4, f10, d12, __AudioType_stringToEnum, Y2, bool, str2));
                F2 = i10;
                F3 = i11;
                F = i12;
            }
            l02.close();
            return arrayList;
        } catch (Throwable th) {
            l02.close();
            throw th;
        }
    }

    public static final z insert$lambda$0(ConsumptionSpanDao_Impl consumptionSpanDao_Impl, ConsumptionSpanEntity consumptionSpanEntity, a aVar) {
        aVar.getClass();
        consumptionSpanDao_Impl.__insertAdapterOfConsumptionSpanEntity.insert(aVar, consumptionSpanEntity);
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.consumption.ConsumptionSpanDao
    public Object deleteAll(wn.c<? super z> cVar) {
        Object E = g.E(this.__db, false, true, new d(11), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.consumption.ConsumptionSpanDao
    public Object deleteByIds(List<String> list, wn.c<? super z> cVar) {
        StringBuilder p10 = f.p("DELETE FROM consumption_spans WHERE id IN (");
        m0.j(list.size(), p10);
        p10.append(Separators.RPAREN);
        Object E = g.E(this.__db, false, true, new t(p10.toString(), list, 17), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.data.database.entities.consumption.ConsumptionSpanDao
    public Object getAll(wn.c<? super List<ConsumptionSpanEntity>> cVar) {
        return g.E(this.__db, true, false, new b(this, 21), cVar);
    }

    @Override // io.elevenlabs.data.database.entities.consumption.ConsumptionSpanDao
    public Object insert(ConsumptionSpanEntity consumptionSpanEntity, wn.c<? super z> cVar) {
        Object E = g.E(this.__db, false, true, new t(this, consumptionSpanEntity, 16), cVar);
        if (E == xn.a.f37986a) {
            return E;
        }
        return z.f31622a;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/elevenlabs/data/database/entities/consumption/ConsumptionSpanDao_Impl$Companion;", "", "<init>", "()V", "", "Loo/d;", "getRequiredConverters", "()Ljava/util/List;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
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
