package io.elevenlabs.data.database.entities.reads;

import ho.l;
import io.elevenlabs.data.database.entities.reads.ReadsDao;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14052c;

    public /* synthetic */ b(int i10, String str) {
        this.f14050a = 3;
        this.f14052c = i10;
        this.f14051b = str;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        ReadsDao.ChapterCharRange chapterCharRange$lambda$0;
        mb.c l02;
        lc.g gVar;
        switch (this.f14050a) {
            case 0:
                chapterCharRange$lambda$0 = ReadsDao_Impl.getChapterCharRange$lambda$0("SELECT starting_char_offset, char_count FROM reads_chapters WHERE read_id = ? AND chapter_index = ?", this.f14051b, this.f14052c, (mb.a) obj);
                return chapterCharRange$lambda$0;
            case 1:
                String str = this.f14051b;
                int i10 = this.f14052c;
                mb.a aVar = (mb.a) obj;
                aVar.getClass();
                l02 = aVar.l0("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    l02.s(1, str);
                    l02.c(2, i10);
                    int F = ae.l.F(l02, "work_spec_id");
                    int F2 = ae.l.F(l02, "generation");
                    int F3 = ae.l.F(l02, "system_id");
                    if (l02.h0()) {
                        gVar = new lc.g(l02.Y(F), (int) l02.getLong(F2), (int) l02.getLong(F3));
                    } else {
                        gVar = null;
                    }
                    return gVar;
                } finally {
                }
            case 2:
                String str2 = this.f14051b;
                int i11 = this.f14052c;
                mb.a aVar2 = (mb.a) obj;
                aVar2.getClass();
                l02 = aVar2.l0("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    l02.s(1, str2);
                    l02.c(2, i11);
                    l02.h0();
                    l02.close();
                    return z.f31622a;
                } finally {
                }
            default:
                int i12 = this.f14052c;
                String str3 = this.f14051b;
                mb.a aVar3 = (mb.a) obj;
                aVar3.getClass();
                l02 = aVar3.l0("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    l02.c(1, i12);
                    l02.s(2, str3);
                    l02.h0();
                    l02.close();
                    return z.f31622a;
                } finally {
                }
        }
    }

    public /* synthetic */ b(String str, int i10, int i11) {
        this.f14050a = i11;
        this.f14051b = str;
        this.f14052c = i10;
    }
}
