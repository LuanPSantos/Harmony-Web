package com.luan.harmony.domain.tone.controller

import com.luan.harmony.domain.chord.model.note.Note
import com.luan.harmony.domain.chord.model.note.Note.Value.C
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField
import com.luan.harmony.domain.tone.harmonicfiled.HarmonicField.Type.MELODIC_MINOR
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.hasSize
import org.springframework.beans.factory.annotation.Autowired

@SpringBootTest
@AutoConfigureMockMvc
class ToneControllerIT(
        @Autowired
        private val mockMvc: MockMvc
) {

    @Test
    fun `Should get tone by value`() {
        mockMvc.get("/tones/{value}", C) {
            accept = MediaType.APPLICATION_JSON
        }.andExpect {
            status { isOk() }
            jsonPath("$.value", `is`("C"))
            jsonPath("$.harmonicFields", hasSize<Int>(4))
        }
    }

    @Test
    fun `Should get harmonic field by type and tone value`() {
        mockMvc.get("/tones/{value}/harmonic-fields/{type}", C, MELODIC_MINOR) {
            accept = MediaType.APPLICATION_JSON
        }.andExpect {
            status { isOk() }
            jsonPath("$.type", `is`("MELODIC_MINOR"))
            jsonPath("$.tetrads", hasSize<Int>(7))
            jsonPath("$.triads", hasSize<Int>(7))
        }
    }
}