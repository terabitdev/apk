package io.elevenlabs.data.database.entities.reads;

import a2.t0;
import ho.l;
import i1.c3;
import i1.m0;
import i1.q;
import i1.x;
import i1.y0;
import io.elevenlabs.highlighter.t;
import j1.e1;
import java.util.List;
import oa.n;
import q2.o2;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14065a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14066b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14067c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14070f;

    public /* synthetic */ g(e1 e1Var, e1 e1Var2, e1 e1Var3, int i10, e1 e1Var4) {
        this.f14067c = e1Var;
        this.f14068d = e1Var2;
        this.f14069e = e1Var3;
        this.f14066b = i10;
        this.f14070f = e1Var4;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        List all$lambda$1;
        m0 c5;
        switch (this.f14065a) {
            case 0:
                all$lambda$1 = ReadsDao_Impl.getAll$lambda$1("SELECT `read_id`, `sync_state`, `article_image_url`, `author`, `char_count`, `created_at_unix`, `updated_at_unix`, `added_at_unix`, `description`, `last_listened_char_offset`, `source`, `title`, `subtitle`, `url`, `word_count`, `original_file_type`, `has_original_audio`, `mature_content`, `origin`, `content_type`, `genre`, `html_checksum`, `from_user_import`, `rating_average`, `rating_count`, `user_rating`, `last_used_voice_id`, `creation_status`, `creation_progress`, `is_archived`, `marked_as_unread`, `completed_at_unix`, `publicationDate`, `language`, `publisherProfileId`, `can_delete`, `android_product_id`, `is_paid`, `previewAudio`, `original_audio_voice_name`, `original_audio_voice_image`, `voice_selection_config`, `sample_config_id`, `display_mode`, `in_user_library`, `can_use_assistant`, `audio_type`, `use_drm`, `last_listened_audio_file_number`, `last_listened_audio_seconds`, `audio_types`, `is_voice_changer_on`, `last_used_audio_type`, `cover_image_urls`, `cover_aspect_ratio`, `blur_placeholder` FROM (SELECT *, (CAST(last_listened_char_offset AS FLOAT) / CAST(char_count AS FLOAT)) as _progress FROM reads WHERE ((is_archived IS NULL) OR (is_archived = ?) OR (? IS NULL)) AND (sync_state <> ?)ORDER BY CASE ? WHEN 'updated_at_unix' THEN updated_at_unix END DESC, CASE ? WHEN 'added_at_unix' THEN added_at_unix END DESC, CASE ? WHEN 'progress' THEN _progress END ASC LIMIT ?)", (Boolean) this.f14067c, (ReadsDao_Impl) this.f14068d, (SyncState) this.f14069e, (String) this.f14070f, this.f14066b, (mb.a) obj);
                return all$lambda$1;
            default:
                e1 e1Var = (e1) this.f14067c;
                e1 e1Var2 = (e1) this.f14068d;
                e1 e1Var3 = (e1) this.f14069e;
                e1 e1Var4 = (e1) this.f14070f;
                int i10 = ((o2) ((x) ((q) obj)).a()).f27478a;
                int i11 = this.f14066b;
                if (i10 == 1) {
                    c5 = i1.l.c(y0.l(new n(12), e1Var).a(y0.e(e1Var2, 2)), y0.f(e1Var3, 2).a(y0.o(new t(i11, 21), e1Var)));
                } else {
                    c5 = i1.l.c(y0.l(new t(i11, 21), e1Var).a(y0.e(e1Var2, 2)), y0.o(new n(12), e1Var).a(y0.f(e1Var3, 2)));
                }
                c5.f12835d = new c3(true, new t0(e1Var4, 22));
                return c5;
        }
    }

    public /* synthetic */ g(Boolean bool, ReadsDao_Impl readsDao_Impl, SyncState syncState, String str, int i10) {
        this.f14067c = bool;
        this.f14068d = readsDao_Impl;
        this.f14069e = syncState;
        this.f14070f = str;
        this.f14066b = i10;
    }
}
